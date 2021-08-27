package thread;

import java.util.Arrays;
import java.util.concurrent.*;

/**
 * @Author Joy
 * @Date 2021/8/17
 */
public class ForkJoinTest extends RecursiveTask<Integer> {

    private final int threshold = 10;
    private int[] arr;

    public ForkJoinTest(int[] arr) {
        this.arr = arr;
    }

    @Override
    protected Integer compute() {
        int result = 0;
        // 直接计算
        if (arr.length <= threshold) {
            for (int i = 0; i < arr.length; i++) {
                result += arr[i];
            }
            return result;
        }
        int middle = arr.length >> 1;
        ForkJoinTest left = new ForkJoinTest(Arrays.copyOfRange(arr, 0, middle));
        ForkJoinTest right = new ForkJoinTest(Arrays.copyOfRange(arr, middle, arr.length));
        return left.fork().join() + right.fork().join();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        ForkJoinTest forkJoinTest = new ForkJoinTest(arr);
        ForkJoinPool joinPool = new ForkJoinPool();
        ForkJoinTask<Integer> submit = joinPool.submit(forkJoinTest);
        System.out.println(submit.get());
    }
}
