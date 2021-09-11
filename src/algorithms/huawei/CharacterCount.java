package algorithms.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

/**
 * @Author Joy
 * @Date 2021/9/7
 * @Desc HJ10 字符个数统计
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ASCII码范围内(0~127，包括0和127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
 */
public class CharacterCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bf.readLine().toCharArray();
        BitSet bit = new BitSet(128);
        for(char ch : chars){
            if(!bit.get(ch)){
                bit.set(ch);
            }
        }
        System.out.println(bit.cardinality());
    }
}
