package com.ec.v2.entity.customer;

import lombok.Data;

/**
 * 
 * @Title: QueryCrmGroupItem.java
 * @Description: 客户分组模型
 * @author shicy
 * @date 2020-03-24 03:56:21
 */
@Data

public class QueryCrmGroupItem {
	/**
	 * 分组ID
	 */
	private String groupId;

	/**
	 * 分组名称
	 */
	private String groupName;
}
