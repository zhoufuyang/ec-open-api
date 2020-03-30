package com.ec.v2.entity.customer.change;

import lombok.Data;


/**
 * 
 * @Title: ChangeAbandonVO.java
 * @Description: 放弃客户 请求模型
 * @author shicy
 * @date 2020-03-24 10:26:02
 */
@Data
public class ChangeAbandonVO {
    
    /**
     * 操作人ID 
     */
 
    private Long optUserId;
    
    /***
     * 客户ID列表最多200个 逗号分隔
     */
   
    private String crmIds;
    
    /**
     * 0 放弃到业务组公海 >0 放弃到公司大公海
     */
    private int type;
}
