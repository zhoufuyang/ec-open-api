package com.ec.v2.entity.customer;

import java.util.ArrayList;
import java.util.List;

import com.ec.v2.entity.BaseResp;

import lombok.Data;

/**
 * 
 * @Title: QueryCrmGroupItem.java
 * @Description: 客户分组模型
 * @author shicy
 * @date 2020-03-24 03:56:21
 */
@Data
public class QueryCrmGroupResp extends BaseResp {
	private List<QueryCrmGroupItem> data = new ArrayList<>();
}
