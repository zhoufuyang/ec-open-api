package com.ec.v2.entity.asynchronization;


import com.ec.v2.entity.TimeRangeBaseVO;
import java.io.Serializable;
import lombok.Data;


@Data
public class AsyncCreateTrajectoryVO implements Serializable {


    private static final long serialVersionUID = 5224871752198279946L;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务类型
     */
    private Integer type;

    private String crmIds;

    private Long userId;

    private TimeRangeBaseVO date;

    private Integer trajectoryType;
}
