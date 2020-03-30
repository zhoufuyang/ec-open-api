package com.ec.v2.entity.robot;

import java.util.List;
import lombok.Data;

/**
 * RoBotTelRecordListVO
 *
 * @author : BorgXiao@126.com
 * @version : 1.0
 * @date :  2018-12-19 16:06
 **/
@Data
public class RoBotTelRecordListVO {
    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 嵌套验证必须用@Valid
     */
    private List<RoBotTelRecordVO> data;
}
