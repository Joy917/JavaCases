package algorithms.huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author Joy
 * @Date 2021/9/2
 * @Desc •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入：
 * abc
 * 123456789
 * 输出：
 * abc00000
 * 12345678
 * 90000000
 */
public class SubString {
    // 无脑先拼接，依赖切割
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String input = scan.nextLine();
            if(input.length()%8!=0){
                input += "00000000";
            }
            while(input.length()>=8){
                System.out.println(input.substring(0,8));
                input = input.substring(8);
            }
        }
    }
}
