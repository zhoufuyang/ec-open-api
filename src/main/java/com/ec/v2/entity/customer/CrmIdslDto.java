package com.ec.v2.entity.customer;

import lombok.Data;


@Data
public class CrmIdslDto {
	/**
     * 客户ID集合。 2 个以上的crmid , 使用英文逗号分开
     */
    private String crmIds;
}
