package algorithms.huawei;

import java.util.Scanner;

/**
 * @Author Joy
 * @Date 2021/9/6
 * @Desc HJ7 取近似值
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
 */
public class GetSimilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float in = scan.nextFloat();
        System.out.println(Math.round(in));
    }
}
