package com.ec.v2.entity.organization;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工信息响应模型
 *
 * @date 2019-12-20
 */

@Data
@NoArgsConstructor
public class UserInfoVO {

    private Long userId;

    private String userName;

    private Long deptId;

    private String title;

    private Integer status;

    public UserInfoVO(Long userId, String userName, Long deptId, String title, Integer status) {
        this.userId = userId;
        this.userName = userName;
        this.deptId = deptId;
        this.title = title;
        this.status = status;
    }
}
