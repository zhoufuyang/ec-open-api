package com.ec.v2.entity.organization;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class DeptAddResponse {

    private Long deptId;

    public DeptAddResponse(Long deptId) {
        this.deptId = deptId;
    }
}
