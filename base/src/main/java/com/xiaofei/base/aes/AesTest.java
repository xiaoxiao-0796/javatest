package com.xiaofei.base.aes;

import org.junit.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 近些年DES使用越来越少，原因就在于其使用56位密钥，比较容易被破解，近些年来逐渐被AES替代，
 * AES已经变成目前对称加密中最流行算法之一；AES可以使用128、192、和256位密钥，并且用128位分组加密和解密数据
 * linux 下解密失败{
 *      SecureRandom 实现完全隨操作系统本身的內部狀態，除非調用方在調用 getInstance 方法之後又調用了 setSeed 方法；
 *      该实现在 windows 上每次生成的 key 都相同，但是在 solaris 或部分 linux 系统上则不同。
 * }
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/21 0021 ProjectName: javatest
 */
public class AesTest {

    public static String password = "PASSWORD";

    /**加密
     * @param content 需要加密的内容
     * @param password  加密密码
     * @return
     */
    public static String encrypt(String content, String password) {
        try {
            BASE64Encoder base64en = new BASE64Encoder();
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128, new SecureRandom(password.getBytes()));
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            byte[] byteContent = content.getBytes("utf-8");
            cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(byteContent);
            String encode = base64en.encode(result);
            return encode; // 加密
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**解密
     *
     * @param content  待解密内容
     * @param password 解密密钥
     * @return
     */
    public static String decrypt(String content, String password) {
        try {
            BASE64Decoder base64de = new BASE64Decoder();
            byte[] bytes = base64de.decodeBuffer(content);
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128, new SecureRandom(password.getBytes()));
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(bytes);
            String decode = new String(result);
            return decode; // 加密
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void test1() throws Exception {
        String bytes = AesTest.encrypt("nihao", password);
        System.out.println(new String(bytes));
        String decrypt = AesTest.decrypt(bytes, password);
        System.out.println(decrypt);

    }
}
