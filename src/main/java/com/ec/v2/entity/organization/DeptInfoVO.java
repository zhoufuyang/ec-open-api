package com.ec.v2.entity.organization;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 部门信息响应模型
 *
 * @date 2019-12-20
 */
@Data
@NoArgsConstructor
public class DeptInfoVO {


    private Long deptId;

    private String deptName;

    private Long parentDeptId;

    public DeptInfoVO(Long deptId, String deptName, Long parentDeptId) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.parentDeptId = parentDeptId;
    }
}
