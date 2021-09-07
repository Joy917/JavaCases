package algorithms.huawei;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * @Author Joy
 * @Date 2021/9/6
 * @Desc HJ8 合并表记录
 * 数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 */
public class CombineTableRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(bf.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < num; i++) {
            String[] kv = bf.readLine().split("\\s");
            Integer k = Integer.parseInt(kv[0]);
            Integer v = Integer.parseInt(kv[1]);
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + v);
            } else {
                map.put(k, v);
            }
        }
        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
