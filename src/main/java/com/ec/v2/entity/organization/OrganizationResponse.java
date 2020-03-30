package com.ec.v2.entity.organization;

import com.ec.v2.entity.BaseResp;
import lombok.Data;

/**
 * OrganizationResponse
 *
 * @author ZhouFuYang
 * @date 2020-03-24
 */
@Data
public class OrganizationResponse<T> extends BaseResp {

    private T data;


}
