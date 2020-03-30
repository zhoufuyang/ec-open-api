package com.ec.v2.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.ec.v2.entity.record.SmsRecordPageResp;
import com.ec.v2.entity.record.SmsRecordVO;
import com.ec.v2.entity.record.TelRecordPageResp;
import com.ec.v2.entity.record.TelRecordVO;
import com.ec.v2.entity.record.TelStatusVo;
import java.io.IOException;

import com.alibaba.fastjson.JSONObject;
import com.ec.v2.constact.UrlConstants.RECORD;
import com.ec.v2.entity.record.CallRecordVo;
import com.ec.v2.entity.record.RecordResponse;
import com.ec.v2.utlis.HttpUtils;
import java.util.List;

/**
 * Record
 *
 * @author ZhouFuYang
 * @date 2020-03-23
 */
public class Record {

    /**
     * 电话外呼
     */
    public static RecordResponse<Void> call(CallRecordVo callRecordVo) throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(RECORD.TELL_CALL);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(callRecordVo);
        String str = HttpUtils.post(paramsJson, postUrl);
        JSONObject jsonObject = JSONObject.parseObject(str);
        RecordResponse recordResponse = new RecordResponse();
        recordResponse.setCode(jsonObject.getInteger("code"));
        recordResponse.setMsg(jsonObject.getString("message"));
        return JSON.parseObject(str, new TypeReference<RecordResponse<Void>>() {
        });
    }

    /**
     * 电话空闲用户
     */
    public static RecordResponse<List<Long>> getFreeStatusUid(TelStatusVo telStatusVo) throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(RECORD.GET_FREE_STATUS_UID);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(telStatusVo);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, new TypeReference<RecordResponse<List<Long>>>() {
        });
    }

    /**
     * 短信记录
     */
    public static RecordResponse<SmsRecordPageResp> smsRecord(SmsRecordVO smsRecordVO) throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(RECORD.SMS_RECORD);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(smsRecordVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, new TypeReference<RecordResponse<SmsRecordPageResp>>() {
        });
    }

    /**
     * 电话记录
     */
    public static RecordResponse<TelRecordPageResp> telRecord(TelRecordVO telRecordVO) throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(RECORD.TEL_RECORD);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(telRecordVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, new TypeReference<RecordResponse<TelRecordPageResp>>() {
        });
    }
}
