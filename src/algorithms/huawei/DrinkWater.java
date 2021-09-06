package algorithms.huawei;

import java.util.Scanner;

/**
 * @Author Joy
 * @Date 2021/9/6
 * @Desc HJ22 汽水瓶
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：
 * 先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，
 * 这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
 * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 */
public class DrinkWater {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<10;i++){
            int input = scan.nextInt();
            if(0==input){
                break;
            }
            // 能喝多少瓶汽水
            int result = 0;
            // 能兑换成汽水的数量
            int count = 0;
            while(input>2){
                count = input/3;
                // 兑换完以后的空瓶总数（汽水+剩余空瓶）
                input = count + input%3;
                // 兑换出来就能喝
                result += count;
            }
            // 只剩两个空瓶还可以借一个
            if(input==2){
                result++;
            }
            System.out.println(result);
        }
    }
}
