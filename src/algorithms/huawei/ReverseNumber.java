package algorithms.huawei;

import java.util.Scanner;

/**
 * @Author Joy
 * @Date 2021/9/6
 * @Desc HJ11 数字颠倒
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] in = scan.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = in.length - 1; i >= 0; i--) {
            sb.append(in[i]);
        }
        System.out.println(sb);
    }
}
