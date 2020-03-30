package com.ec.v2.entity.organization;


import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 部门创建数据请求模型
 *
 * @date 2019-12-17
 */

@Data
@NoArgsConstructor
public class DeptAddVO {

    private String deptName;

    private Long parentDeptId;

    private Long optUserId;

    public DeptAddVO(String deptName, Long parentDeptId, Long optUserId) {
        this.deptName = deptName;
        this.parentDeptId = parentDeptId;
        this.optUserId = optUserId;
    }
}
