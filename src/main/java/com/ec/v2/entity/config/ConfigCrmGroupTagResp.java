package com.ec.v2.entity.config;

import java.util.List;
import lombok.Data;

@Data
public class ConfigCrmGroupTagResp {
    /**
     * 标签分组ID
     */
    private Long labelGroupId;
    /**
     * 标签分组名称
     */
    private String labelGroupName;
    /**
     * 标签分组排序
     */
    private Integer labelGroupSort;
    /**
     * 标签分组类型
     */
    private Integer labelGroupType;
    /**
     * 标签集合
     */
    private List<ConfigCrmTagResp> labelList;
}
