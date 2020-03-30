package com.ec.v2.entity.customer;

import lombok.Data;

/**
 * 
 * @Title: UpdateStageVO.java
 * @Description: 修改客户阶段
 * @author shicy
 * @date 2020-03-24 04:42:54
 */
@Data
public class UpdateStageVO {
	/**
	 * 用于记录进行该操作的人员ID
	 */
	private Long optUserId;

	/**
	 * 需要进行操作的客户ID
	 */
	private String crmIds;

	/**
	 * 客户阶段ID
	 */
	private Integer step;
}
