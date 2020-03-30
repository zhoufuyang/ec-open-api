package com.ec.v2.entity.config;

import java.util.List;
import lombok.Data;

@Data
public class ConfigCustomFieldResp {
    /**
     * 字段ID
     */
    private Integer fieldId;
    /**
     * 字段名称
     */
    private String fieldName;
    /**
     * 字段排序
     */
    private Integer fieldSort;
    /**
     * 字段类型
     */
    private Integer filedType;
    /**
     * 字段所属分组ID
     */
    private Integer fieldGroupId;
    /**
     * 字段所属分组
     */
    private String fieldGroupName;
    /**
     * 字段分组排序
     */
    private Integer fieldGroupSort;
    /**
     * 字段参数
     */
    private List<ConfigCustomFieldParamResp> fieldParam;
}
