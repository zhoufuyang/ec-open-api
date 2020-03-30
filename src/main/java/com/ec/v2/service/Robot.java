package com.ec.v2.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ec.v2.constact.UrlConstants.ROBOT;
import com.ec.v2.entity.robot.AddRobotTaskVO;
import com.ec.v2.entity.robot.RoBotTelRecordListVO;
import com.ec.v2.entity.robot.RobotResponse;
import com.ec.v2.entity.robot.UpdateRobotTaskVO;
import com.ec.v2.utlis.HttpUtils;
import java.io.IOException;

/**
 * Robot
 *
 * @author ZhouFuYang
 * @date 2020-03-24
 */
public class Robot {

    /**
     * 机器人新增任务
     */
    public static RobotResponse addTask(AddRobotTaskVO addRobotTaskVO) throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(ROBOT.ADD_TASK);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(addRobotTaskVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, RobotResponse.class);
    }

    /**
     * 机器人新增电话记录
     */
    public static RobotResponse addtaskrecord(RoBotTelRecordListVO roBotTelRecordListVO)
            throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(ROBOT.ADD_TASK_RECORD);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(roBotTelRecordListVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, RobotResponse.class);
    }

    /**
     * 机器人更新任务
     */
    public static RobotResponse updatetask(UpdateRobotTaskVO updateRobotTaskVO) throws IOException {
        String postUrl = HttpUtils.buildUrl(ROBOT.UPDATE_TASK);
        // 2. 构建请求参数
        String paramsJson = JSONObject.toJSONString(updateRobotTaskVO);
        String str = HttpUtils.post(paramsJson, postUrl);
        return JSON.parseObject(str, RobotResponse.class);
    }
}
