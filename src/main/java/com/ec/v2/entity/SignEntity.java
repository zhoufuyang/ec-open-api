package com.ec.v2.entity;


import com.ec.v2.config.Config;
import com.ec.v2.utlis.SignUtil;
import lombok.Data;
@Data
public class SignEntity {
	
	/**
	 * 企业id
	 */
	protected Long X_EC_CID;
	/**
	 * 当前时间戳
	 */
	protected Long X_EC_TIMESTAMP;
	/**
	 * 签名
	 */
	protected String X_EC_SIGN;
	
	/**
	 * 
	 * @Title: setSignParam
	 * @Description: 生成签名对象
	 * @param timeStamp
	 * @param config
	 * @return
	 * @author shicy
	 * @date 2020-03-23 04:17:58
	 */
	public static SignEntity  setSignParam(Long timeStamp, Config config) {
		SignEntity entity = new SignEntity();
		String signParam =  SignUtil.getSign(timeStamp, config.getAppId(), config.getSecret());
		entity.X_EC_TIMESTAMP = timeStamp;
		entity.X_EC_SIGN = signParam;
		entity.X_EC_CID = config.getCorpId();
		return entity;
	}
	
}
