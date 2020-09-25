package com.order.utils;

import sun.security.jca.GetInstance;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * @author wl
 * @Data 2020-09-22
 */
public class MD5Util {
    public static String encrypt(String source){
        return encodeMd5(source.getBytes());
    }
    private static String encodeMd5(byte[] source){
        try {
            return encodeHex(MessageDigest.getInstance("MD5").digest(source));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public static String encodeHex(byte[] bytes){
        StringBuffer sb = new StringBuffer(bytes.length*2);
        for (int i = 0; i < bytes.length; i++) {
            if (((int)bytes[i] & 0xff) <0x10)
                sb.append("0");
            sb.append(Long.toString((int)bytes[i] & 0xff,16));
        }
        return sb.toString();
    }
    /**
     * 生成随机盐值
     *
     * @return
     */
    public static String getSalt() {
        String random = String.valueOf(new Random().nextLong());
        String randomMD5 = MD5Util.encrypt(random);
        return randomMD5.substring(0, 5);
    }

    public static void main(String[] args) {
        String password = encrypt("123456");
        System.out.println(password);
    }
}
