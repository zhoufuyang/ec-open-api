package com.ec.v2.entity.organization;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class UserAddResponse {

    private Long userId;

    public UserAddResponse(Long userId) {
        this.userId = userId;
    }
}
