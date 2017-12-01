package com.xiaofei.base.aes;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * AES加密
 * 创建者  科帮网
 * 创建时间 2015年2月7日
 *
 */
public class SecurityAES1 {
    private final static String encoding = "UTF-8";
    private static String SECERTKEY = "PASSWORD";


    @Test
    public void test1(){
         String s = "123456";
        String encryptAES = SecurityAES1.encryptAES(s);
        System.out.println(encryptAES);
        System.out.println(encryptAES.length());
        String decrypt = SecurityAES1.decrypt(encryptAES);
        System.out.println(decrypt);
    }

    @Test
    public void test2(){
        String encryptAES = "RTA2MjlDM0U4NjU4Q0M0MUFFQzgyREQxRTlFQ0E0MUY4NjA0NkM1NzlBNTlFMjY4RENDQTU1Nzk5Q0RENjBGQjMwNEY4RDc0M0UwRDk5NjYxMTU4NUU1RTFCODU0RDU5";
        String decrypt = SecurityAES1.decrypt(encryptAES);
        System.out.println(decrypt);
    }
    /**
     * AES加密
     * @Author  科帮网
     * @param content
     * @return  String
     * @Date    2015年2月7日
     * 更新日志
     * 2015年2月7日 科帮网  首次创建
     *
     */
    public static String encryptAES(String content) {
        byte[] encryptResult = encrypt(content);
        String encryptResultStr = parseByte2HexStr(encryptResult);
        // BASE64位加密
        encryptResultStr = ebotongEncrypto(encryptResultStr);
        return encryptResultStr;
    }
    /**
     * AES解密
     * @Author  科帮网
     * @param encryptResultStr
     * @return  String
     * @Date    2015年2月7日
     * 更新日志
     * 2015年2月7日 科帮网  首次创建
     *
     */
    public static String decrypt(String encryptResultStr) {
        // BASE64位解密
        String decrpt = ebotongDecrypto(encryptResultStr);
        byte[] decryptFrom = parseHexStr2Byte(decrpt);
        byte[] decryptResult = decrypt(decryptFrom);
        return new String(decryptResult);
    }
    /**
     * 加密字符串
     * @Author  科帮网
     * @param str
     * @return  String
     * @Date    2015年2月7日
     * 更新日志
     * 2015年2月7日 科帮网  首次创建
     *
     */
    public static String ebotongEncrypto(String str) {
        String result = str;
        if (str != null && str.length() > 0) {
            try {
                byte[] encodeByte = str.getBytes(encoding);
                result = Base64.encodeBase64String(encodeByte);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //base64加密超过一定长度会自动换行 需要去除换行符
        return result.replaceAll("\r\n", "").replaceAll("\r", "").replaceAll("\n", "");
    }
    /**
     * 解密字符串
     * @Author  科帮网
     * @param str
     * @return  String
     * @Date    2015年2月7日
     * 更新日志
     * 2015年2月7日 科帮网  首次创建
     *
     */
    public static String ebotongDecrypto(String str) {
            byte[] encodeByte = Base64.decodeBase64(str);
            return new String(encodeByte);
    }
    /**
     * 加密  
     * @Author  科帮网
     * @param content
     * @return  byte[]
     * @Date    2015年2月7日
     * 更新日志
     * 2015年2月7日 科帮网  首次创建
     *
     */
    private static byte[] encrypt(String content) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            //防止linux下 随机生成key
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );
            secureRandom.setSeed(SECERTKEY.getBytes());
            kgen.init(128, secureRandom);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            byte[] byteContent = content.getBytes("utf-8");
            cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(byteContent);
            return result; // 加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 解密
     * @Author  科帮网
     * @param content
     * @return  byte[]
     * @Date    2015年2月7日
     * 更新日志
     * 2015年2月7日 科帮网  首次创建
     *
     */
    private static byte[] decrypt(byte[] content) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            //防止linux下 随机生成key
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );
            secureRandom.setSeed(SECERTKEY.getBytes());
            kgen.init(128, secureRandom);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器   
            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化   
            byte[] result = cipher.doFinal(content);
            return result; // 加密   
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 将二进制转换成16进制  
     * @Author  科帮网
     * @param buf
     * @return  String
     * @Date    2015年2月7日
     * 更新日志
     * 2015年2月7日 科帮网  首次创建
     *
     */
    public static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }
    /**
     * 将16进制转换为二进制  
     * @Author  科帮网
     * @param hexStr
     * @return  byte[]
     * @Date    2015年2月7日
     * 更新日志
     * 2015年2月7日 科帮网  首次创建
     *
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length()/2];
        for (int i = 0;i< hexStr.length()/2; i++) {
            int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
            int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }
}