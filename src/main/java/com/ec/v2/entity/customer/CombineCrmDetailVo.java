package com.ec.v2.entity.customer;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @Title: CombineCrmDetailVo.java
 * @Description: 合并客户CombineCrmDetailVo
 * @author shicy
 * @date 2020-03-24 03:37:44
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CombineCrmDetailVo extends CustomerDetail {
	/**
	 * 操作人
	 */
	private Long optUserId;

	/**
	 * 跟进人
	 */
	private Long followUserId;

	/**
	 * 合并的crmids
	 */
	private String crmIds;

	/**
	 * 分组id
	 */
	private Integer groupId;
}
