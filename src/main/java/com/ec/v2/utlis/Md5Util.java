package com.ec.v2.utlis;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5Util MD5加密
 *
 * @author : caibin
 **/
public class Md5Util {
    
    /**
     * MD5加密
     * @param sourceStr
     * @return
     */
    public static String encryptMd5(String sourceStr) {
        // 用于加密的字符
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

}
