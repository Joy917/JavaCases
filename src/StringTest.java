import java.security.NoSuchAlgorithmException;
import java.util.BitSet;

/**
 * @Author Joy
 * @Date 2021/8/20
 */
public class StringTest {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1==s2);
        System.out.println(s2.substring(1));
//        System.out.println(new StringBuilder("haha"));
        System.out.println("5.5".split("."));
        BitSet bitSet = new BitSet(128);
        bitSet.cardinality();


    }
}
