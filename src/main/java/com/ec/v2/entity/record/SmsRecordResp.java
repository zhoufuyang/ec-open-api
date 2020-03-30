package com.ec.v2.entity.record;

import lombok.Data;

@Data
public class SmsRecordResp {
    private String sendTime;

    private String phoneNumber;

    private Long crmId;

    private Long userId;

    private String content;
}
