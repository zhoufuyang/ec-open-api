package com.ec.v2.entity.record;

import com.ec.v2.entity.BaseResp;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * RecordResponse
 *
 * @date 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RecordResponse<T> extends BaseResp {
    private T data;
}
