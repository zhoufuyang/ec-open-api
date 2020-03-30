package com.ec.v2.utlis;

/**
 * 
 * @Title: SignUtil.java
 * @Description: 签名工具类
 * @author BorgXiao@126.com
 * @date 2020-03-23 11:30:28
 */
public class SignUtil {
    
    /**
     * 签名过期时间60秒
     */
    private static long SIGN_EXPIRE_TIME = 30000;
    
  
    
    /**
     * 
     * @Title: checkSign
     * @Description: 验证签名
     * @param signParam 等待验证的签名
     * @param timeStamp 时间戳
     * @param appId
     * @param appSecret 秘钥
     * @author shicy
     * @date 2020-03-23 11:31:05
     */
    public static void checkSign(String signParam, long timeStamp, String appId, String appSecret) {
         //签名过期
         long currentTime = System.currentTimeMillis();
         if ((currentTime - timeStamp) >  SIGN_EXPIRE_TIME) {
             throw new RuntimeException("签名超时");
         }
         String sign = getSign(timeStamp, appId, appSecret);
         if (!sign.equals(signParam)) {
        	 throw new RuntimeException("签名验证失败");
         }
    }
    
  
    /**
     * 
     * @Title: getSign
     * @Description: 生成签名
     * @param timeStamp  时间戳
     * @param appId 
     * @param appSecret  秘钥
     * @return
     * @author shicy
     * @date 2020-03-23 11:32:03
     */
    public static String getSign(long timeStamp, String appId, String appSecret){
        //签名过期
        StringBuffer buffer = new StringBuffer();
        buffer.append("appId="+appId);
        buffer.append("&appSecret="+appSecret);
        buffer.append("&timeStamp="+timeStamp);
        return Md5Util.encryptMd5(buffer.toString()).toUpperCase();
    }
}
