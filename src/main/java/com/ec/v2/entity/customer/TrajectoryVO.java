package com.ec.v2.entity.customer;

import com.ec.v2.entity.TimeRangeBaseVO;

import lombok.Data;

@Data
public class TrajectoryVO {

	private String crmIds;

	private TimeRangeBaseVO date;

	/**
	 * 轨迹小类型
	 */
	private Integer trajectoryType;

	/**
	 * 	用于分页使用， 本次查询所 返回的数据 的  crmid > lastId
	 */
	private Long lastId = 0L;

	/**
	 * 如果参参数传递， 那么 将会覆盖 date.startTime
	 */
	private String lastTime;

	/**
	 * 必须满足  pageSize > 0 && pageSize <= 200 
	 */
	private Integer pageSize = 200;
}
