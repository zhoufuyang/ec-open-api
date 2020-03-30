package com.ec.v2.entity.record;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class TelRecordPageResp {
    private List<TelRecordResp> telRecordList = new ArrayList<>();
    private NextPageDTO nextPageDTO = new NextPageDTO();
}
