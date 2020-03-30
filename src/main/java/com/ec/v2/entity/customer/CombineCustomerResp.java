package com.ec.v2.entity.customer;

import com.ec.v2.entity.BaseResp;

import lombok.Data;

@Data
public class CombineCustomerResp extends BaseResp {
	// 合并后， 返回最小的 crmid
	private Long data;
}
