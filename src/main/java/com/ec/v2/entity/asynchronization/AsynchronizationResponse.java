package com.ec.v2.entity.asynchronization;

import com.ec.v2.entity.BaseResp;
import java.util.Map;
import lombok.Data;

/**
 * AsynchronizationResponse
 *
 * @author ZhouFuYang
 * @date 2020-03-24
 */
@Data
public class AsynchronizationResponse<T> extends BaseResp {
    private T data;
}
