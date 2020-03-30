package com.ec.v2.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.alibaba.fastjson.JSONObject;
import com.ec.v2.constact.UrlConstants;
import com.ec.v2.entity.customer.change.ChangeAbandonVO;
import com.ec.v2.entity.customer.change.ChangeResp;
import com.ec.v2.entity.customer.change.ChangeUserVO;
import com.ec.v2.utlis.HttpUtils;

/**
 * 
 * @Title: CustomerChange.java
 * @Description: 客户流转相关接口， 包括 如下接口
 * <p>1. 放弃客户 : /v2/customer/change/abandon </p>
 * <p>2. 变跟跟进人: /v2/customer/change/user</p>
 * @author shicy
 * @date 2020-03-24 10:19:09
 */
public class CustomerChange {

	
	
	 /**
	  * 
	  * @Title: abandon
	  * @Description: 放弃客户
	  * <p>支持放入到公海， 支持放弃到指定的业务组</p>
	  * <p>支持批量放弃，最多同时放弃200个客户</p>
	  * @param dto
	  * @return
	  * @throws ClientProtocolException
	  * @throws IOException
	  * @author shicy
	  * @date 2020-03-24 10:40:36
	  */
	 public static ChangeResp abandon(ChangeAbandonVO dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMERCHANGE.ABANDON);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(dto);
        String str =  HttpUtils.post(paramsJson,postUrl);
        ChangeResp data = JSONObject.parseObject(str, ChangeResp.class);
        return data;
    }
	 
	 
	 /**
	  * 
	  * @Title: user
	  * @Description: 修改跟进人
	  * <p>支持批量修改，最多同时修改200个客户</p>
	  * @param dto
	  * @return
	  * @throws ClientProtocolException
	  * @throws IOException
	  * @author shicy
	  * @date 2020-03-24 10:48:40
	  */
	 public static ChangeResp user(ChangeUserVO dto) throws ClientProtocolException, IOException {
	        // 1.构建  接口Url
	        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMERCHANGE.USER);
	        // 2. 构建请求参数
	        String paramsJson = JSONObject.toJSONString(dto);
	        String str =  HttpUtils.post(paramsJson,postUrl);
	        ChangeResp data = JSONObject.parseObject(str, ChangeResp.class);
	        return data;
	    }
	 
	
}
