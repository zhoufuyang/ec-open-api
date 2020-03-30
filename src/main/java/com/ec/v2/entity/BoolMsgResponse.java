package com.ec.v2.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * RecordResponse
 *
 * @date 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class BoolMsgResponse extends BaseResp {
    private Boolean data;
}
