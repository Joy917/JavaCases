package algorithms.huawei;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author Joy
 * @Date 2021/9/2
 * @Desc 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        // 方法一，使用双端队列，addFirst 模拟压栈
        Deque<String> deque = new LinkedList();
        for (String s : input.split("\\s+")) {
            deque.addFirst(s);
        }
        System.out.println(String.join(" ", deque));
        // 方法二：使用栈
//        Stack<String> stack = new Stack();
//        for (String s : input.split(" ")) {
//            stack.add(s);
//        }
//        StringBuilder sb = new StringBuilder();
//        while (!stack.isEmpty()) {
//            sb.append(stack.pop()).append(" ");
//        }
//        System.out.println(sb.toString().trim());
    }
}
