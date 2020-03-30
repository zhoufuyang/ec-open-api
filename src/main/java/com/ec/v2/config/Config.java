package com.ec.v2.config;

/**
 * @author shicy
 * @Title: Config.java
 * @Description: 这里存放的是您 的配置信息
 * @date 2020-03-10 10:00:00
 */
public class Config {
	/**
	 * 您的企业id, 这里是默认配置，实际情况，需要您修改成自己对应的配置
	 */
	Long corpId;

	/**
	 * 您的企业appId, 这里是默认配置，实际情况，需要您修改成自己对应的配置
	 */
	String appId;
	/**
	 * 您的企业 secret, 这里是默认配置，实际情况，需要您修改成自己对应的配置
	 */
	String secret;

	/**
	 * 访问的域名， 不要改这个配置 外网地址https://open.workec.com
	 */
	String domain = "https://open.workec.com";

	/**
	 * 访问的编码， 统一 utf-8, 最好不要修改这个配置
	 */
	String encoding = "UTF-8";

	private static Config config = null;

	private Config() {
	};

	@Override
	public String toString() {
		return "Config [corpId=" + corpId + ", appId=" + appId + ", secret=" + secret + ", domain=" + domain
				+ ", encoding=" + encoding + "]";
	}

	public Long getCorpId() {
		return corpId;
	}

	public void setCorpId(Long corpId) {
		this.corpId = corpId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	/**
	 * 
	 * @Title: initConfig
	 * @Description: 
	 * @param corpId
	 * @param appId
	 * @param secret
	 * @return
	 * @author shicy
	 * @param domain 
	 * @date 2020-03-23 04:41:03
	 */
	/**
	 * 
	 * @Title: initConfig
	 * @Description: 第一次调用接口之前，请调用该方法初始化配置
	 * @param corpId
	 * @param appId
	 * @param secret
	 * @param domain 传 null 表示 使用 线网域名， EC 开发人员需要指定域名
	 * @return
	 * @author shicy
	 * @date 2020-03-25 03:44:38
	 */
	public static Config initConfig(long corpId, String appId, String secret, String domain) {
		Config config = initConfig(corpId, appId, secret);
		if(domain!=null && !domain.trim().equals("")) {
			config.domain = domain;
		}
		return config;
	}
	
	/**
	 * 
	 * @Title: initConfig
	 * @Description: 第一次调用接口之前，请调用该方法初始化配置,  该接口使用默认域名
	 * @param corpId
	 * @param appId
	 * @param secret
	 * @return
	 * @author shicy
	 * @date 2020-03-25 03:46:43
	 */
	public static Config initConfig(long corpId, String appId, String secret) {
		config = new Config();
		config.appId = appId;
		config.corpId = corpId;
		config.secret = secret;
		return config;
	}


	/**
	 * 
	 * @Title: get
	 * @Description: 获取配置
	 * @return
	 * @author shicy
	 * @date 2020-03-23 04:41:26
	 */
	public static Config get() {
		if (config == null) {
			throw new RuntimeException("未初始化配置");
		}
		return config;
	}

}
