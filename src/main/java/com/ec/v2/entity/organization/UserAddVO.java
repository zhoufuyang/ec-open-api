package com.ec.v2.entity.organization;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工创建数据请求模型
 *
 * @date 2019-12-17
 */
@Data
@NoArgsConstructor
public class UserAddVO {

    private String name;

    private String account;

    private String title;

    private String email;

    private Long deptId;

    private Long optUserId;

    public UserAddVO(String name, String account, String title, String email, Long deptId, Long optUserId) {
        this.name = name;
        this.account = account;
        this.title = title;
        this.email = email;
        this.deptId = deptId;
        this.optUserId = optUserId;
    }
}
