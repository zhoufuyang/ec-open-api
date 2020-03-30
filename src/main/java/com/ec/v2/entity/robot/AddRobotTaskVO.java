package com.ec.v2.entity.robot;


import lombok.Data;


/**
 * AddRobotTaskVO
 * 电话任务
 *
 * @author : CaiBin
 * @version : 1.0
 * @date :  2018-12-17 14:27
 **/
@Data
public class AddRobotTaskVO {
    /**
     * 任务标题
     */
    private String title;

    /**
     * 任务状态
     */
    private Integer type;

    /**
     * 创建人ID
     */
    private Long userId;

    /**
     * 创建时间
     */
    private String time;

    /**
     * 完成时间
     */
    private String finishTime;

    /**
     * 任务拨打量
     */
    private String finish;

    /**
     * 任务总量
     */
    private String total;

    /**
     * 电话话术
     */
    private String craft;

    /**
     * 机器人厂家ID
     */
    private String robotId;
}
