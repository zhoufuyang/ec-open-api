package com.ec.v2.entity.customer;

import lombok.Data;

@Data
public class TrajectoryItem {

    /**
     * 轨迹内容
     */
    private String content;

    /**
     * 轨迹ID
     */
    private String trajectoryId;

    /**
     * 操作用户ID
     */
    private String userId;

    /**
     * 客户ID
     */
    private String crmId;

    /**
     * 接收人ID
     */
    private String receiveUserIds;

    /**
     * 创建时间
     */
    private String createTime;
}
