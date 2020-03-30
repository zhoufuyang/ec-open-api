package com.ec.v2.entity.organization;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工状态数据请求模型
 *
 * @date 2019-12-19
 */
@Data
@NoArgsConstructor
public class UserStatusVO {

    private Long userId;

    private Integer status;

    private Long optUserId;

    public UserStatusVO(Long userId, Integer status, Long optUserId) {
        this.userId = userId;
        this.status = status;
        this.optUserId = optUserId;
    }
}
