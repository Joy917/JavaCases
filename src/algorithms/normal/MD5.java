package algorithms.normal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author Joy
 * @Date 2021/9/11
 * @Desc md5 加密封装
 */
public class MD5 {
    public static byte[] encrypt(String input) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return md5.digest(input.getBytes());
    }
}
