package algorithms.huawei;

import java.util.Scanner;

/**
 * @Author Joy
 * @Date 2021/9/6
 * @Desc HJ6 质数因子
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 */
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long in = scan.nextLong();
        for (long i = 2; in > 1; ) {
            if (in % i == 0) {
                System.out.print(i + " ");
                in /= i;
                continue;
            }
            // 没法整除就递增
            i++;
            // 大于开平方时无需遍历后面，剩余部分本身就是一个质因数
            if (i > Math.sqrt(in)) {
                System.out.print(in + " ");
                break;
            }
        }
    }
}
