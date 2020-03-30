package com.ec.v2.entity.asynchronization;

import java.io.Serializable;
import lombok.Data;

@Data
public class AsyncQueryVO implements Serializable {
    private static final long serialVersionUID = -5754430926318609302L;
    /**
     * 任务ID
     */
    private Integer taskId;
    /**
     * 异步任务状态
     */
    private Integer taskStatus;
}
