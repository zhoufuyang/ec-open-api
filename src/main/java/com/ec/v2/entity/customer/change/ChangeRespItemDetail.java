package com.ec.v2.entity.customer.change;

import lombok.Data;

/**
 * 
 * @Title: ChangeRespItemDetail.java
 * @Description: 放弃客户 和 修改跟进人 请求模型返回信息
 * @author shicy
 * @date 2020-03-24 10:33:59
 */
@Data

public class ChangeRespItemDetail {
	/**
	 * 状态码 200成功
	 */

	private Integer code;

	/**
	 * 错误信息
	 */

	private String msg;

	/**
	 * 客户ID
	 */

	private Long crmId;

	/**
	 * 客户名字
	 */

	private String name;
}