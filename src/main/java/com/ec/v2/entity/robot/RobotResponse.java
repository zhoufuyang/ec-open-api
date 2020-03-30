package com.ec.v2.entity.robot;

import com.alibaba.fastjson.JSON;
import com.ec.v2.entity.BaseResp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * RobotResponse
 *
 * @author ZhouFuYang
 * @date 2020-03-24
 */
@Data
public class RobotResponse extends BaseResp {
    private Map<Object,Object> data;
}
