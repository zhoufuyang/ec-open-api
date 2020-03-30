package com.ec.v2.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import com.alibaba.fastjson.parser.ParserConfig;
import com.ec.v2.constact.UrlConstants.ORGANIZATION;
import com.ec.v2.entity.organization.DeptAddResponse;
import com.ec.v2.entity.organization.DeptAddVO;
import com.ec.v2.entity.organization.DeptEditVO;
import com.ec.v2.entity.organization.OrganizationResponse;
import com.ec.v2.entity.organization.StructInfoVO;
import com.ec.v2.entity.organization.UserAddResponse;
import com.ec.v2.entity.organization.UserAddVO;
import com.ec.v2.entity.organization.UserStatusVO;
import com.ec.v2.entity.record.RecordResponse;
import com.ec.v2.entity.record.TelRecordPageResp;
import com.ec.v2.utlis.HttpUtils;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Organization
 *
 * @date 2020-03-24
 */
public class Organization {

    /**
     * 创建部门
     */
    public static OrganizationResponse<DeptAddResponse> createDept(DeptAddVO deptVO)
            throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(ORGANIZATION.CREATE);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(deptVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, new TypeReference<OrganizationResponse<DeptAddResponse>>() {
        });
    }

    /**
     * 编辑部门
     */
    public static OrganizationResponse<Void> editDept(DeptEditVO deptVO) throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(ORGANIZATION.EDIT);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(deptVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, new TypeReference<OrganizationResponse<Void>>() {
        });
    }

    /**
     * 架构信息
     */
    public static OrganizationResponse<StructInfoVO> getStructInfo() throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(ORGANIZATION.INFO);
        String str = HttpUtils.get(postUrl);
        return JSON.parseObject(str, new TypeReference<OrganizationResponse<StructInfoVO>>() {
        });
    }

    /**
     * 创建员工
     */
    public static OrganizationResponse<UserAddResponse> createUser(UserAddVO userVO)
            throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(ORGANIZATION.CREATE_USER);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(userVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, new TypeReference<OrganizationResponse<UserAddResponse>>() {
        });
    }

    /**
     * 启用/禁用员工
     */
    public static OrganizationResponse<Void> userOnOrOff(UserStatusVO userVO) throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(ORGANIZATION.ON_OFF_USER);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(userVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, new TypeReference<OrganizationResponse<Void>>() {
        });
    }
}
