package com.ec.v2.entity.asynchronization;

import com.ec.v2.entity.TimeRangeBaseVO;
import java.io.Serializable;
import lombok.Data;


@Data
public class AsyncCreateCustomerVO implements Serializable {
    private static final long serialVersionUID = 7236906032975775911L;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务类型
     */
    private Integer type;
    /**
     * 客户阶段
     */
    private Integer step;
    /**
     * 标签IDs
     */
    private String labelIds;
    /**
     * 跟进人ID
     */
    private Long followUserId;
    /**
     * 公海ID
     */
    private Long publicPondId;
    /**
     * 动态时间
     */
    private TimeRangeBaseVO modifyTime;
    /**
     * 联系时间
     */
    private TimeRangeBaseVO contactTime;
    /**
     * 创建时间
     */
    private TimeRangeBaseVO createTime;
}
