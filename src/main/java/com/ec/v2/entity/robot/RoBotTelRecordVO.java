package com.ec.v2.entity.robot;


import lombok.Data;

/**
 * RoBotTelRecordVO
 * 机器人电话记录
 *
 * @author : CaiBin
 * @version : 1.0
 * @date :  2018-12-17 17:18
 **/
@Data
public class RoBotTelRecordVO {
    /**
     * 手机号 格式+86 13537634952
     */
    private String mobile;

    /**
     * 座机号格式+86-075586025236-456   +86-075586025236
     */
    private String phone;

    /**
     * 任务标记类型
     */
    private String type;

    /**
     * 姓名
     */
    private String name;

    /**
     * 呼叫时间
     */
    private String callTime;

    /**
     * 通话时长
     */
    private Integer talkTime;

    /**
     * 通话录音
     */
    private String record;

}
