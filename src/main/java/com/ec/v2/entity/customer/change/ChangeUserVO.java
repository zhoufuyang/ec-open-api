package com.ec.v2.entity.customer.change;

import lombok.Data;

/**
 * 
 * @Title: ChangeUserVO.java
 * @Description: 变更客户跟进人请求模型
 * @author shicy
 * @date 2020-03-24 10:24:47
 */
@Data

public class ChangeUserVO {
    
    /**
     *	跟进人ID
     */
    private Long followUserId;
    /**
     * 	客户ID列表最多200个 逗号分隔
     */
    private String crmIds;
    
    /**
     * 	操作人ID
     */
    private Long optUserId;
}