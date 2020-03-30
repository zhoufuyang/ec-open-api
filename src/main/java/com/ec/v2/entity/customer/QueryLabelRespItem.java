package com.ec.v2.entity.customer;

import lombok.Data;

@Data
public class QueryLabelRespItem {
	 /**
     * 客户ID
     */
    private Long crmId;
    /**
     * 标签ID
     */
    private String labelIds;
}
