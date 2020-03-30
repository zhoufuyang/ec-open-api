package com.ec.v2.entity.customer;

import lombok.Data;

@Data
public class UpdateCustomerVo extends CustomerDetail {
	/**
	 * 操作人
	 */
	private Long optUserId;

	/**
	 * 客户crmid
	 */
	private Long crmId;
}
