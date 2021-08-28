package thread;


import thread.model.SingleA;

/**
 * @Author Joy
 * @Date 2021/8/27
 * @Desc ThreadLocal 线程安全的用法：初始化返回不同对象，或者基础类型的封装类
 */
public class ThreadLocal_Safe {
    private static final ThreadLocal<SingleA> threadLocal = ThreadLocal.withInitial(() -> new SingleA());

    public static void main(String[] args) {

        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                threadLocal.get().setNumber(threadLocal.get().getNumber() + 5);
                System.out.println(Thread.currentThread().getName() + ": " + threadLocal.get().getNumber());
            }, "thread-" + i);
        }
        for (Thread thr : threads) {
            thr.start();
        }
    }
    /**结果：
     * thread-0: 5
     * thread-2: 5
     * thread-1: 5
     * thread-3: 5
     * thread-4: 5
     */
}
