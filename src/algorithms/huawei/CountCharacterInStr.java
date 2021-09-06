package algorithms.huawei;

import java.util.Scanner;

/**
 * @Author Joy
 * @Date 2021/9/6
 * @Desc 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。
 *       不区分大小写，字符串长度小于500。
 */
public class CountCharacterInStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//         char[] input = scan.nextLine().toLowerCase().toCharArray();
//         char ch = Character.toLowerCase(scan.nextLine().charAt(0));
//         int count = 0;
//         for(int i = 0;i<input.length;i++){
//             if(ch == (input[i])){
//                 count++;
//             }
//         }
//         System.out.println(count);
        // 方法二：利用替换后长度相减
        String input = scan.nextLine().toLowerCase();
        String ch = scan.nextLine().toLowerCase();
        System.out.println(input.length() - input.replace(ch, "").length());
    }
}
