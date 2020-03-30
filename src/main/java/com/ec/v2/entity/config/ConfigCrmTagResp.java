package com.ec.v2.entity.config;

import lombok.Data;

@Data
public class ConfigCrmTagResp {
    /**
     * 标签ID
     */
    private Long labelId;
    /**
     * 标签名称
     */
    private String labelName;
    /**
     * 标签排序
     */
    private Integer labelSort;
}
