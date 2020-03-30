package com.ec.v2.entity.record;

import lombok.Data;

@Data
public class CallRecordVo {

    /**
     * 被叫公司 0-128个字符
     */
    private String company;
    /**
     * 被叫公司地址 0-128个字符
     */
    private String companyAddress;
    /**
     * 被叫公司网站 0-128个字符
     */
    private String companyUrl;
    /**
     * 被叫邮箱 6-64个字符
     */
    private String email;
    /**
     * 性别描述 男/女
     */
    private String gender;
    /**
     * 被叫姓名 1-64个字符
     */
    private String name;
    /**
     * 呼叫的号码 最多16个字符
     */
    private String phone;
    /**
     * 被叫职位 0-128个字符
     */
    private String title;
    /**
     * 用户ID 必填1-10位
     */
    private String userid;

}
