package com.ec.v2.entity.asynchronization;

import java.io.Serializable;
import lombok.Data;

@Data
public class ApiExportDTO implements Serializable {
    private static final long serialVersionUID = 863363182629425927L;
    /**
     * 主键
     */
    private Long taskId;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 导出状态 0等待 1执行中 2成功 3失败 4删除
     */
    private Integer taskStatus;
    /**
     * 路径
     */
    private String file;
}
