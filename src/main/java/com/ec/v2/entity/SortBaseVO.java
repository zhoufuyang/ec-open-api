package com.ec.v2.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class SortBaseVO implements Serializable {
    private static final long serialVersionUID = -3978555305387484186L;
    /**
     * 排序字段
     */
    private String sortField;
    /**
     * 倒叙or正序
     */
    private String sortType;
}
