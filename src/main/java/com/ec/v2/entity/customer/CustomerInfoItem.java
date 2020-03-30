package com.ec.v2.entity.customer;


import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class CustomerInfoItem {
    /**
     * 客户ID
     */
    private Long crmId;
    /**
     * 跟进人ID
     */
    private Long followUserId;
    /**
     * 分组ID
     */
    private Integer groupId;
    /**
     * 名字
     */
    private String name;
    /**
     * 称呼
     */
    private String call;
    /**
     * 性别男女未知
     */
    private String gender;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 来源
     */
    private String channel;
    /**
     * 职位
     */
    private String title;
    /**
     * QQ
     */
    private String qq;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 座机
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 地区
     */
    private String prefecture;
    /**
     * 传真
     */
    private String fax;
    /**
     * 行业
     */
    private String vocation;
    /**
     * 公司
     */
    private String company;
    /**
     * 公司网址
     */
    private String companyUrl;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 备注
     */
    private String memo;
    /**
     * 动态时间
     */
    private String modifyTime;
    /**
     * 联系时间
     */
    private String contactTime;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 创建人ID
     */
    private Long createUserId;
    /**
     * 最后跟进人ID
     */
    private Long lastFollowUserId;
    /**
     * 自定义字段信息
     */
    private List<Map<Integer,String>> fieldInfos;

    /**
     * 是否农历 默认阳历  0阳历 1农历
     */
    private Integer isLunarBirthday = 0;
    /**
     * 客户阶段
     */
    private Integer step;
}
