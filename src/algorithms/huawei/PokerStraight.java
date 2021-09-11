package algorithms.huawei;

import java.util.*;
import java.io.*;

/**
 * HJ：扑克牌顺子
 * 2除外，不包含大小王。
 * 输入范围（可能包含多个相同，只能用一次）：3,4,5,6,7,8,9,10,J,Q,K,A
 * 输出：字符串数组，每组是顺子
 */
public class PokerStraight {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] ins = bf.readLine().split("\\s");
        ArrayList<Integer> list = new ArrayList();
        for (String s : ins) {
            if (s.equals("2")) {
                continue;
            }
            list.add(Integer.valueOf(change(s)));
        }
        Collections.sort(list);
        ArrayList<String> results = new ArrayList();
        findSub(list, results);
        if (results.isEmpty()) {
            System.out.println("No");
        } else {
            for (String s : results) {
                System.out.println(s);
            }
        }
    }

    // 判断连续数是否是顺子
    public static void findSub(List<Integer> list, ArrayList<String> results) {
        int start = 0;
        int end = 1;
        int currentIndex = -1;
        List<Integer> last = new ArrayList();
        while (end < list.size()) {
            if (list.get(end) - list.get(end - 1) != 1) {
                start = end;
                end++;
                continue;
            }
            if (end - start >= 4) {
                List<Integer> tmp = list.subList(start, end + 1);
                StringBuilder sb = new StringBuilder();
                for (Integer integer : tmp) {
                    sb.append(change(String.valueOf(integer))).append(" ");
                }
                results.add(sb.toString());
                currentIndex++;
                // 已存在子串
                if (!last.isEmpty() && tmp.containsAll(last)) {
                    results.remove(currentIndex-1);
                    currentIndex--;
                }
                last = tmp;
            }
            end++;
        }
    }

    public static String change(String ch) {
        String result = ch;
        switch (ch) {
            case "J":
                result = "11";
                break;
            case "Q":
                result = "12";
                break;
            case "K":
                result = "13";
                break;
            case "A":
                result = "14";
                break;
            case "11":
                result = "J";
                break;
            case "12":
                result = "Q";
                break;
            case "13":
                result = "K";
                break;
            case "14":
                result = "A";
                break;
        }
        return result;
    }
}