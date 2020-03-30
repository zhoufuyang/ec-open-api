package com.ec.v2.entity.record;

import lombok.Data;

@Data
public class TelRecordResp {

    private String startTime;

    private String phoneNumber;

    private Long crmId;

    private long callTime;

    private Long userId;

    private String path;

    private int callType;

    private int inOutType;
}
