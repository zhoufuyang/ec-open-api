package com.ec.v2.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.ec.v2.constact.UrlConstants.ASYNCHRONIZATION;
import com.ec.v2.entity.asynchronization.ApiExportDTO;
import com.ec.v2.entity.asynchronization.ApiExportResp;
import com.ec.v2.entity.asynchronization.AsyncCreateCustomerVO;
import com.ec.v2.entity.asynchronization.AsyncCreateSmsVO;
import com.ec.v2.entity.asynchronization.AsyncCreateTelVO;
import com.ec.v2.entity.asynchronization.AsyncCreateTrajectoryVO;
import com.ec.v2.entity.asynchronization.AsyncQueryVO;
import com.ec.v2.entity.asynchronization.AsynchronizationResponse;
import com.ec.v2.utlis.HttpUtils;
import java.io.IOException;

/**
 * Asynchronization
 *
 * @author ZhouFuYang
 * @date 2020-03-24
 */
public class Asynchronization {

    /**
     * 创建异步导出客户任务
     */
    public static  AsynchronizationResponse<ApiExportResp> create(AsyncCreateCustomerVO asyncCreateCustomerVO)
            throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(ASYNCHRONIZATION.CREATE);
        // 2. 构建请求参数
        String paramsJson = JSON.toJSONString(asyncCreateCustomerVO);
        String str = HttpUtils.post(paramsJson, postUrl);

        return JSONObject
                .parseObject(str, new TypeReference<AsynchronizationResponse<ApiExportResp>>() {
                });
    }
    /**
     * 创建异步导出轨迹任务
     */
    public static AsynchronizationResponse<ApiExportResp> create(
            AsyncCreateTrajectoryVO asyncCreateTrajectoryVO)
            throws IOException {
        String postUrl = HttpUtils.buildUrl(ASYNCHRONIZATION.CREATE);
        String paramsJson = JSON.toJSONString(asyncCreateTrajectoryVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSONObject
                .parseObject(str, new TypeReference<AsynchronizationResponse<ApiExportResp>>() {
                });
    }
    /**
     * 创建异步导出电话任务
     */
    public static AsynchronizationResponse<ApiExportResp> create(AsyncCreateTelVO asyncCreateTelVO)
            throws IOException {
        String postUrl = HttpUtils.buildUrl(ASYNCHRONIZATION.CREATE);
        String paramsJson = JSON.toJSONString(asyncCreateTelVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSONObject
                .parseObject(str, new TypeReference<AsynchronizationResponse<ApiExportResp>>() {
                });
    }
    /**
     * 创建异步导出短信任务
     */
    public static AsynchronizationResponse<ApiExportResp> create(AsyncCreateSmsVO asyncCreateSmsVO)
            throws IOException {
        String postUrl = HttpUtils.buildUrl(ASYNCHRONIZATION.CREATE);
        String paramsJson = JSON.toJSONString(asyncCreateSmsVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSONObject
                .parseObject(str, new TypeReference<AsynchronizationResponse<ApiExportResp>>() {
                });
    }

    /**
     * 查询任务
     */
    public static AsynchronizationResponse<ApiExportDTO> query(AsyncQueryVO asyncQueryVO)
            throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(ASYNCHRONIZATION.QUERY);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(asyncQueryVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSONObject
                .parseObject(str, new TypeReference<AsynchronizationResponse<ApiExportDTO>>() {
                });
    }
}
