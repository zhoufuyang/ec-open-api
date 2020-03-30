package com.ec.v2.entity.asynchronization;


import com.ec.v2.entity.TimeRangeBaseVO;
import java.io.Serializable;
import lombok.Data;


@Data
public class AsyncCreateTelVO implements Serializable {

    private static final long serialVersionUID = -7328114083393967554L;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务类型
     */
    private Integer type;
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 客户IDs
     */
    private String crmIds;

    /**
     * 电话号码
     */
    private String phoneNumbers;

    /**
     * 动态时间
     */
    private TimeRangeBaseVO date;
}
