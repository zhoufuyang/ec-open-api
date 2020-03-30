package com.ec.v2.entity.record;

import lombok.Data;

/**
 * 下一页分页模型
 */
@Data
public class NextPageDTO {
    private int pageSize = 200;
    private int hasNextPage = 0;
    private String nextLastId = "";
}