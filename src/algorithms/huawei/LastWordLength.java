package algorithms.huawei;

import java.util.Scanner;

/**
 * @Author Joy
 * @Date 2021/9/1
 * @Desc 输入字符串，输出最后一个单词长度，没有标点、输入不为空，结尾没有空格
 */
public class LastWordLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.length() > 5000) {
            System.out.println("长度超过5000！");
            return;
        }
        // 长度比索引大1，且避免没有空格情况
        int lastSpaceIndex = input.lastIndexOf(" ") + 1;
        System.out.println(input.length() - lastSpaceIndex);
        scan.close();
    }

}
