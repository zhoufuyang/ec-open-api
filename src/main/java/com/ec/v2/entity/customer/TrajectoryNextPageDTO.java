package com.ec.v2.entity.customer;

import lombok.Data;

/**
 * 下一页分页模型
 */
@Data
public class TrajectoryNextPageDTO extends NextPageDTO{
    private String nextLastTime = "";
}