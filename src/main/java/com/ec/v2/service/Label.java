package com.ec.v2.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.alibaba.fastjson.JSONObject;
import com.ec.v2.constact.UrlConstants;
import com.ec.v2.entity.BoolMsgResponse;
import com.ec.v2.entity.MsgResponse;
import com.ec.v2.entity.label.UpdateTagVO;
import com.ec.v2.utlis.HttpUtils;


public class Label {
	
	/**
	 * 
	 * @Title: update
	 * @Description: 批量 修改 客户标签 ， 包括新增标签 ， 更新标签 和 清空标签
	 * @param dto
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @author shicy
	 * @date 2020-03-24 10:08:47
	 */
    public static BoolMsgResponse update(UpdateTagVO dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.LABEL.UPDATE);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(dto);
        String str =  HttpUtils.post(paramsJson,postUrl);
        BoolMsgResponse data = JSONObject.parseObject(str, BoolMsgResponse.class);
        return data;
    }
}
