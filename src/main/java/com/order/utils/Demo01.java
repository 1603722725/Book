package com.order.utils;

import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-09-22
 */
public class Demo01 {
    public static void main(String[] args) {
//        byte[] bytes = hexStringToByteArray("5c2d");
//        System.out.println(Arrays.toString(bytes));
        byte[] bytes = {2};
        int res = (int) bytes[0] & 0xff;
        int res1 = 0xff;
        System.out.println(res + "==============" + res1);
        String s = encodeHex(bytes);
        System.out.println(s);
    }
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
    private static String encodeHex(byte[] bytes) {
        StringBuffer buffer = new StringBuffer(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            if (((int) bytes[i] & 0xff) < 0x10)
                buffer.append("0");
            buffer.append(Long.toString((int) bytes[i] & 0xff, 16));
        }
        return buffer.toString();
    }
}
