package thread;

import thread.model.SingleA;

/**
 * @Author Joy
 * @Date 2021/8/27
 * @Desc ThreadLocal 作用的是同一个对象时，线程不安全，无法隔离
 */
public class ThreadLocal_Unsafe {
    private static SingleA singleA = new SingleA();
    private static final ThreadLocal<SingleA> threadLocal = new ThreadLocal<SingleA>() {
        @Override
        protected SingleA initialValue() {
            return singleA;
        }
    };

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
     * thread-2: 15
     * thread-1: 10
     * thread-3: 20
     * thread-4: 25
     */
}
