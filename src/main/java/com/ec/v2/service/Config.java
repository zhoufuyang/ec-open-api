package com.ec.v2.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.ec.v2.constact.UrlConstants.CONFIG;
import com.ec.v2.entity.config.ConfigCrmGroupTagResp;
import com.ec.v2.entity.config.ConfigCustomFieldResp;
import com.ec.v2.entity.config.ConfigPubicPondResp;
import com.ec.v2.entity.config.ConfigResponse;
import com.ec.v2.utlis.HttpUtils;
import java.io.IOException;

/**
 * Config
 *
 * @author ZhouFuYang
 * @date 2020-03-24
 */
public class Config {

    /**
     * 自定义字段
     */
    public static ConfigResponse<ConfigCustomFieldResp> getFieldMapping() throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(CONFIG.GET_FIELD_MAPPING);
        String str = HttpUtils.get(postUrl);
        return JSON.parseObject(str, new TypeReference<ConfigResponse<ConfigCustomFieldResp>>() {
        });
    }

    /**
     * 标签信息
     */
    public static ConfigResponse<ConfigCrmGroupTagResp> getLabelInfo() throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(CONFIG.GET_LABEL_INFO);
        String str = HttpUtils.get(postUrl);
        return JSON.parseObject(str, new TypeReference<ConfigResponse<ConfigCrmGroupTagResp>>() {
        });
    }

    /**
     * 业务组信息
     */
    public static ConfigResponse<ConfigPubicPondResp> getPubicPond() throws IOException {
        // 1.构建  接口Url
        String postUrl = HttpUtils.buildUrl(CONFIG.GET_PUBLIC_POND);
        String str = HttpUtils.get(postUrl);
        return JSON.parseObject(str, new TypeReference<ConfigResponse<ConfigPubicPondResp>>() {
        });
    }
}
