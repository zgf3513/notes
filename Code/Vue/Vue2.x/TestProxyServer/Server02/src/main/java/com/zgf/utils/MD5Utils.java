package com.zgf.utils;

import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class MD5Utils {
    //盐
    private static final String salt = UUID.randomUUID().toString().replace("-", "");

    public static String getMD5(String string, String salt) {
        String val = string + salt;
        String md5 = DigestUtils.md5DigestAsHex(val.getBytes(StandardCharsets.UTF_8));
        return md5Concat(md5, salt);
    }

    public static String getMD5(String string) {
        String val = string + salt;
        String md5 = DigestUtils.md5DigestAsHex(val.getBytes(StandardCharsets.UTF_8));
        return md5Concat(md5, salt);
    }

    public static String getMd5WithoutSalt(String string) {
        return DigestUtils.md5DigestAsHex(string.getBytes(StandardCharsets.UTF_8));
    }

    // 将md5和salt混合
    public static String md5Concat(String md5, String salt) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < md5.length(); i++) {
            sb.append(md5.charAt(i));
            if (i < salt.length()) {
                sb.append(salt.charAt(i));
            }
        }
        return sb.toString();
    }

    // 根据混合的规律提取出salt
    public static String md5SplitSalt(String md5) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < md5.length(); i++) {
            if (i % 2 != 0) {
                sb.append(md5.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("随机盐："+salt);
        System.out.println("随机盐加密："+getMD5("123456"));
        String ideSalt = md5SplitSalt(getMD5("123456"));
        System.out.println("提取盐："+ideSalt);
        System.out.println("提取盐加密："+getMD5("123456", ideSalt));
    }

}
