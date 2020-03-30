package com.ec.v2.entity.record;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class SmsRecordPageResp {
     private List<SmsRecordResp> smsRecordList = new ArrayList<>();
     private NextPageDTO nextPageDTO = new NextPageDTO();
}
