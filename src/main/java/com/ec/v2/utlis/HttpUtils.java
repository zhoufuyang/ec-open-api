package com.ec.v2.utlis;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;
import com.ec.v2.config.Config;
import com.ec.v2.entity.SignEntity;
import java.io.IOException;

public class HttpUtils {

	public static HttpPost buidPostRequest(String paramsJson, String postUrl) {
		Config config = Config.get();
		StringEntity postingString = new StringEntity(paramsJson, config.getEncoding());
		HttpPost post = new HttpPost(postUrl);
		post.setEntity(postingString);
		post.setHeader("Content-type", "application/json");
		Long timeStamp = System.currentTimeMillis();
		SignEntity sign = SignEntity.setSignParam(timeStamp, config);
		post.setHeader("X-Ec-Cid", sign.getX_EC_CID() + "");
		post.setHeader("X-Ec-TimeStamp", sign.getX_EC_TIMESTAMP() + "");
		post.setHeader("X-Ec-Sign", sign.getX_EC_SIGN());
		return post;
	}

	public static HttpPost buidPostRequest(String postUrl) {
		Config config = Config.get();
		HttpPost post = new HttpPost(postUrl);
		post.setHeader("Content-type", "application/json");
		Long timeStamp = System.currentTimeMillis();
		SignEntity sign = SignEntity.setSignParam(timeStamp, config);
		post.setHeader("X-Ec-Cid", sign.getX_EC_CID() + "");
		post.setHeader("X-Ec-TimeStamp", sign.getX_EC_TIMESTAMP() + "");
		post.setHeader("X-Ec-Sign", sign.getX_EC_SIGN());
		return post;
	}

	public static String buildUrl(String url) {
		return Config.get().getDomain() + url;
	}

	public static String post(String params, String url) throws IOException {
		// 1. 构建请求
		HttpPost post = buidPostRequest(params, url);
		// 2. 请求数据
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpResponse response = httpClient.execute(post);
		// 3. 解析结果
		return EntityUtils.toString(response.getEntity(), Config.get().getEncoding());
	}

	public static String post(String url) throws IOException {
		// 1. 构建请求
		HttpPost post = buidPostRequest(url);
		// 2. 请求数据
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpResponse response = httpClient.execute(post);
		// 3. 解析结果
		return EntityUtils.toString(response.getEntity(), Config.get().getEncoding());
	}

	public static String get(String url) throws IOException {
		HttpGet get = buidGetRequest(url);
		// 2. 请求数据
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpResponse response = httpClient.execute(get);
		// 3. 解析结果
		return EntityUtils.toString(response.getEntity(), Config.get().getEncoding());
	}

	public static String get(String url, Object dto) throws IOException {
		String jsonStr = JSONObject.toJSONString(dto);
		JSONObject json = JSONObject.parseObject(jsonStr);
		String parmas = buildGetParmas(json);
		url = url + "?" + parmas;
		return get(url);
	}

	private static String buildGetParmas(JSONObject json) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(String key : json.keySet()) {
			Object val = json.get(key);
			if(val==null) {
				continue;
			}
			String strVal = val.toString();
			if(strVal.trim().equals("")) {
				continue;
			}
			if(i>0) {
				sb.append("&");	
			}
			sb.append(key).append("=").append(strVal);
			i++;
		}
		return new String(sb);
	}

	public static HttpGet buidGetRequest(String postUrl) {
		Config config = Config.get();
		HttpGet get = new HttpGet(postUrl);
		get.setHeader("Content-type", "application/json");
		Long timeStamp = System.currentTimeMillis();
		SignEntity sign = SignEntity.setSignParam(timeStamp, config);
		get.setHeader("X-Ec-Cid", sign.getX_EC_CID() + "");
		get.setHeader("X-Ec-TimeStamp", sign.getX_EC_TIMESTAMP() + "");
		get.setHeader("X-Ec-Sign", sign.getX_EC_SIGN());
		return get;
	}
}
