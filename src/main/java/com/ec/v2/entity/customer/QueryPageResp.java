package com.ec.v2.entity.customer;

import com.ec.v2.entity.BaseResp;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
public class QueryPageResp extends BaseResp {
	private CustomerInfoPageItem data;
}
