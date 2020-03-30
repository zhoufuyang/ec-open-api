package com.ec.v2.entity.customer;

import lombok.Data;

/**
 * 下一页分页模型
 */
@Data
public class NextPageDTO {
    protected int pageSize = 200;
    protected int hasNextPage = 0;
    protected String nextLastId = "";
}