package algorithms.huawei;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author Joy
 * @Date 2021/9/1
 * @Desc 输入字符串数组长度和内容，将字符串数组按字典逆序打印
 */
public class SortStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < lines; i++) {
            // 这种写法会把空行也算进去，导致少输入一个字符串，所以要判断
//            String str = scan.nextLine();
//            list.add(str);
            if (scan.hasNextLine()) {
                list.add(scan.next());
            }
        }
        Collections.sort(list, (a, b) -> -a.compareTo(b)
        );
        for (String s : list) {
            System.out.println(s);
        }
        scan.close();
    }
}
