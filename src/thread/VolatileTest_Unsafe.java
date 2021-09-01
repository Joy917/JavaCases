package thread;


/**
 * @Author Joy
 * @Date 2021/8/28
 * @Desc volatile 无法保证并发计算安全，解决方法：increse 加上 synchronized 修饰
 */
public class VolatileTest_Unsafe {
    private static int vol = 0;

    public static synchronized void increse() {
        vol++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    increse();
                }
            }).start();
        }
        // 等待主线程外的线程都结束，2-RUN，1-DEBUG，即如果是 RUN 运行程序的话，
        // 最后除了main线程，在Idea下还会存在一个Monitor Ctrl-Break 的线程，使用socket来监控idea的命令
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(vol);
    }
}
