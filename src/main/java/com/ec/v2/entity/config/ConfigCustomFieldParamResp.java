package com.ec.v2.entity.config;

import lombok.Data;

@Data
public class ConfigCustomFieldParamResp {
    /**
     * 字段选项ID
     */
    private Integer paramId;
    /**
     * 字段选项名称
     */
    private String paramName;
    /**
     * 选项排序
     */
    private Integer paramSort;
}
