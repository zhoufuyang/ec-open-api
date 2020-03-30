package com.ec.v2.entity.customer;

import java.util.Map;

import lombok.Data;

/**
 * 
 * @Title: CustomerDetail.java
 * @Description: 客户基础信息
 * @author shicy
 * @date 2020-03-24 03:39:34
 */
@Data
public class CustomerDetail {
	/**
	 * 跟进人
	 */
	protected Long followUserId;

	/**
	 * 分组id
	 */
	protected Integer groupId;

	/**
	 * 业务组公海
	 */
	protected Long publicPondId;

	/**
	 * 客户姓名
	 */
	protected String name;

	/**
	 * 称呼
	 */
	protected String call;
	/**
	 * 性别 0：未知（默认），1：男，2：女"
	 */
	protected Integer gender;

	/**
	 * 生日 格式：2018-01-01
	 */
	protected String birthday;

	/**
	 * 0/1 是否是阴历 默认0 1:阴历"
	 */
	protected Integer isBirthdayLunar;

	/**
	 * 0/1 是否是阴历润月 默认0
	 */
	protected Byte birthdayLunarLeap;

	/**
	 * 职位
	 */

	protected String title;

	/**
	 * QQ号码
	 */

	protected String qq;

	/**
	 * 手机号码默认空字符串
	 */
	protected String mobile;

	/**
	 * 电话号码 如07558888XXXX-001 默认空字符
	 */
	protected String phone;

	/**
	 * 传真号码 如07558888XXXX-001 默认空字符
	 */
	protected String fax;

	/**
	 * 手机国家码 如 +86 默认空字符串
	 */
	protected String mobileCode;

	/**
	 * 电话国家码 如 +86 默认空字符串
	 */
	protected String phoneCode;

	/**
	 * 传真国家码 如 +86 默认空字符串
	 */
	protected String faxCode;

	/**
	 * 邮箱号码
	 */
	protected String email;

	/**
	 * 公司
	 */
	protected String company;

	/**
	 * 公司网址
	 */
	protected String companyUrl;

	/**
	 * 公司地址"
	 */
	protected String companyAddress;
	/**
	 * 备注
	 */
	protected String memo;

	/**
	 * 行业 格式:一级行业|二级行业
	 */
	protected String vocation;

	/**
	 * 来源ID
	 */
	protected Integer channelId;

	/**
	 * 地区 格式:国家|省州|市名|区县
	 */
	protected String prefecture;

	/**
	 * 自定义字段信息
	 */
	protected Map<String, String> fields;
}
