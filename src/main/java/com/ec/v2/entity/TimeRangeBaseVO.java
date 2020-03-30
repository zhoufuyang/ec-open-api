package com.ec.v2.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class TimeRangeBaseVO implements Serializable {
    private static final long serialVersionUID = 2514161367676437112L;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
}
