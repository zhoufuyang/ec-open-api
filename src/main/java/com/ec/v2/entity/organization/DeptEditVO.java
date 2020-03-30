package com.ec.v2.entity.organization;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeptEditVO {

    private Long deptId;

    private String deptName;

    private Long parentDeptId;

    private Long optUserId;

    public DeptEditVO(Long deptId, String deptName, Long parentDeptId, Long optUserId) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.parentDeptId = parentDeptId;
        this.optUserId = optUserId;
    }
}
