package com.ec.v2.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.alibaba.fastjson.JSONObject;
import com.ec.v2.constact.UrlConstants;
import com.ec.v2.entity.MsgResponse;
import com.ec.v2.entity.customer.AddCustomerResp;
import com.ec.v2.entity.customer.AddCustomerVo;
import com.ec.v2.entity.customer.CombineCrmDetailVo;
import com.ec.v2.entity.customer.CombineCustomerResp;
import com.ec.v2.entity.customer.CrmIdslDto;
import com.ec.v2.entity.customer.PageQueryVO;
import com.ec.v2.entity.customer.PreciseQueryResp;
import com.ec.v2.entity.customer.QueryCrmGroupResp;
import com.ec.v2.entity.customer.QueryCrmGroupVo;
import com.ec.v2.entity.customer.QueryLabelResp;
import com.ec.v2.entity.customer.QueryPageResp;
import com.ec.v2.entity.customer.TrajectoryPageResp;
import com.ec.v2.entity.customer.TrajectoryVO;
import com.ec.v2.entity.customer.UpdateCustomerVo;
import com.ec.v2.entity.customer.UpdateStageResp;
import com.ec.v2.entity.customer.UpdateStageVO;
import com.ec.v2.utlis.HttpUtils;

/**
 * 
 * @Title: Customer.java
 * @Description: 客户相关接口， 包括
 * <p>2. 批量查询客户信息:/v2/customer/addCustomer </p>
 * <p>1. 查询客户标签 :   /v2/customer/queryLabel </p>
 * <p>2. 批量查询客户信息: /v2/customer/preciseQuery </p>
 * @author shicy
 * @date 2020-03-24 11:23:08
 */
public class Customer {
	
	// 批量创建客户
    public static AddCustomerResp addCustomer(AddCustomerVo dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMER.POST_ADDCUSTOMER);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(dto);
        String str =  HttpUtils.post(paramsJson,postUrl);
        AddCustomerResp data = JSONObject.parseObject(str, AddCustomerResp.class);
        return data;
    }
	
	
	//合并客户复制文档
	//接口地址 /v2/customer/combine
    public static CombineCustomerResp combine(CombineCrmDetailVo dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMER.POST_COMBINE);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(dto);
        String str =  HttpUtils.post(paramsJson,postUrl);
        CombineCustomerResp data = JSONObject.parseObject(str, CombineCustomerResp.class);
        return data;
    }
    
    
            
	
	//客户分组复制文档
	//接口地址 /v2/customer/getCustomerGroup
    public static QueryCrmGroupResp getCustomerGroup(QueryCrmGroupVo dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMER.GET_CUSTOMERGROUP);
        // 2. 构建请求参数
        String str =  HttpUtils.get(postUrl,dto);
        QueryCrmGroupResp data = JSONObject.parseObject(str, QueryCrmGroupResp.class);
        return data;
    }
    
    
    
	
	//分页查询客户轨迹复制文档
	//接口地址 /v2/customer/getTrajectory
    public static TrajectoryPageResp getTrajectory(TrajectoryVO dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMER.GET_TRAJECTORY);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(dto);
        String str =  HttpUtils.post(paramsJson,postUrl);
        TrajectoryPageResp data = JSONObject.parseObject(str, TrajectoryPageResp.class);
        return data;
    }
	
    
	
    
    /**
     * 
     * @Title: preciseQuery
     * @Description: 批量查询客户信息
     * <p>最大批次 支持 200 个 crmid</p>
     * @param dto
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author shicy
     * @date 2020-03-24 11:21:55
     */
    public static PreciseQueryResp preciseQuery(CrmIdslDto dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMER.POST_PRECISEQUERY);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(dto);
        String str =  HttpUtils.post(paramsJson,postUrl);
        PreciseQueryResp data = JSONObject.parseObject(str, PreciseQueryResp.class);
        return data;
    }
    
    
    /**
     * 
     * @Title: preciseQuery
     * @Description: 批量查询客户信息
     * <p>最大批次 支持 200 个 crmid</p>
     * @param dto
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @author shicy
     * @date 2020-03-24 11:21:55
     */
    public static QueryPageResp query(PageQueryVO dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMER.POST_QUERY);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(dto);
        String str =  HttpUtils.post(paramsJson,postUrl);
        QueryPageResp data = JSONObject.parseObject(str, QueryPageResp.class);
        return data;
    }
    
    /**
	 * 
	 * @Title: queryLabel
	 * @Description: 查询客户标签
	 * @param dto  业务入参
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @author shicy
	 * @date 2020-03-23 04:19:14
	 */
    public static QueryLabelResp queryLabel(CrmIdslDto dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMER.POST_QUERYLABEL);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(dto);
        String str =  HttpUtils.post(paramsJson,postUrl);
        QueryLabelResp data = JSONObject.parseObject(str, QueryLabelResp.class);
        return data;
    }
    
    
   // 修改客户复制文档
//    接口地址 /v2/customer/updateCustomer
    public static MsgResponse updateCustomer(UpdateCustomerVo dto) throws ClientProtocolException, IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMER.POST_UPDATECUSTOMER);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(dto);
        String str =  HttpUtils.post(paramsJson,postUrl);
        MsgResponse data = JSONObject.parseObject(str, MsgResponse.class);
        return data;
    }
    
    
    //  修改客户阶段
//  接口地址  /v2/step/update
  public static UpdateStageResp updateCustomerStep(UpdateStageVO dto) throws ClientProtocolException, IOException {
      // 1.构建  接口Url
      String postUrl = HttpUtils.buildUrl(UrlConstants.CUSTOMER.POST_UPDATECUSTOMER_STEP);
      // 2. 构建请求参数
      String paramsJson = JSONObject.toJSONString(dto);
      String str =  HttpUtils.post(paramsJson,postUrl);
      UpdateStageResp data = JSONObject.parseObject(str, UpdateStageResp.class);
      return data;
  }
    

}
