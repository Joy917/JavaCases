package algorithms.huawei;

import java.util.Scanner;

/**
 * @Author Joy
 * @Date 2021/9/1
 * @Desc 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 */
public class CountOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int count = 0;
        while (input > 0) {
            if ((input & 1) != 0) {
                count++;
            }
            input >>= 1;
        }
        System.out.println(count);
    }
}
