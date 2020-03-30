package com.ec.v2.entity.config;

import com.ec.v2.entity.BaseResp;
import java.util.List;
import lombok.Data;

/**
 * ConfigResponse
 *
 * @date 2020-03-24
 */
@Data
public class ConfigResponse<T> extends BaseResp {

    private List<T> data;

}
