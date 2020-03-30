package com.ec.v2.entity.label;

import lombok.Data;

/**
 * 
 * @Title: UpdateTagVO.java
 * @Description: 修改客户标签
 * @author shicy
 * @date 2020-03-24 10:00:31
 */
@Data
public class UpdateTagVO {
	/**
	 * 用于记录进行该操作的人员ID
	 */
    private Long optUserId;
    
    /**
     */
    
    /**
     * 需要进行操作的客户ID
     */
    private String crmIds;

    /**
     * 需要替换或者新增的标签id, 如果未空 且 type = 1, 则清空原来用户的标签 
     */
    private String labels;

    /**
     * 替换标签方式：（默认为0）
     * <p>0=增量打标签，如果标签分组为单选，则会替换原有标签，如果为多选则新增标签；</p>
     * <p>1=替换标签，用当前传递的标签替换客户原来的所有标签；当labels参数为空时，替换则清空原有标签。</p>
     */
    private Integer type;
}
