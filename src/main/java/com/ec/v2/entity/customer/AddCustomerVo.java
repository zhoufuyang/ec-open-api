package com.ec.v2.entity.customer;

import java.util.List;

import lombok.Data;

/**
 * 
 * @Title: BatchCreateCrmVo.java
 * @Description: 批量创建客户
 * @author shicy
 * @date 2020-03-24 03:04:11
 */
@Data
public class AddCustomerVo {
	/**
	 * 操作人
	 */
	private Long optUserId;
	/**
	 * 要新增的 客户详细详细
	 */

	private List<CustomerDetail> list;
}
