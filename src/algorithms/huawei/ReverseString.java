package algorithms.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Joy
 * @Date 2021/9/7
 * @Desc HJ12 字符串反转
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 */
public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bf.readLine().toCharArray();
        for(int i = chars.length -1; i>=0; i--){
            System.out.print(chars[i]);
        }
    }
}
