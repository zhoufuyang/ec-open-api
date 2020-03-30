package com.ec.v2.entity.record;

import com.ec.v2.entity.TimeRangeBaseVO;
import lombok.Data;

@Data
public class TelRecordVO {

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

    /**
     * 翻页参数上一页最后记录id
     */
    private Long lastId = 0L;

    /**
     * 分页大小默认200
     */
    private Integer pageSize = 200;
}
