package com.ec.v2.entity.organization;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 组织架构信息响应模型
 *
 * @date 2019-12-20
 */

@Data
@NoArgsConstructor
public class StructInfoVO {

    private List<DeptInfoVO> depts;

    private List<UserInfoVO> users;

    public StructInfoVO(List<DeptInfoVO> depts, List<UserInfoVO> users) {
        this.depts = depts;
        this.users = users;
    }
}
