package algorithms.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Joy
 * @Date 2021/9/7
 * @Desc HJ9 提取不重复的整数
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是0。
 */
public class ExtractUniqueIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bf.readLine().toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (!result.toString().contains(chars[i]+"")) {
                result.append(chars[i]);
            }
        }
        System.out.println(result);
    }
}
