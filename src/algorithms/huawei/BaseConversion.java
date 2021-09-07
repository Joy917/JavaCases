package algorithms.huawei;

import java.util.Scanner;

/**
 * @Author Joy
 * @Date 2021/9/6
 * @Desc HJ5 进制转换
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 */
public class BaseConversion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String in = scan.nextLine();
            Long tmp = Long.parseLong(in.substring(2),16);
            System.out.println(tmp);
        }
    }
}
