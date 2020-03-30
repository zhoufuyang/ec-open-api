package com.ec.v2.entity.robot;

import lombok.Data;

/**
 * UpdateRobotTaskVO
 * 电话任务
 *
 * @author : CaiBin
 * @version : 1.0
 * @date :  2018-12-17 14:27
 **/
@Data
public class UpdateRobotTaskVO {
    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 任务标题
     */
    private String title;

    /**
     * 完成时间
     */
    private String finishTime;

    /**
     * 电话话术
     */
    private String craft;

    /**
     * 任务拨打量
     */
    private String finish;
}
