package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author Joy
 * @Date 2021/8/28
 * @Desc 原子类保证线程安全
 */
public class AtomicIntegerTest_Safe {
    private static AtomicInteger atomic = new AtomicInteger(0);

    public static void increse() {
        atomic.getAndIncrement();
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
        System.out.println(atomic);
    }

}
