package thread;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author Joy
 * @Date 2021/8/26
 * @Desc 线程池测试用例
 */
public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        // 线程池的创建方式有几种？
        // 第一种
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        ExecutorService singlePool = Executors.newSingleThreadExecutor();
        ExecutorService fixedPool = Executors.newFixedThreadPool(1);
        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 3; i++) {
            ScheduledFuture<String> scheduleResult = scheduledPool.schedule(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "Hello world";
                }
            }, 3L, TimeUnit.SECONDS);
            try {
                System.out.println(scheduleResult.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        scheduledPool.shutdown();
        // 第二种
//        LinkedBlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>(3);
//        ThreadPoolExecutor originPool = new ThreadPoolExecutor(5, 5, 3, TimeUnit.SECONDS, blockingQueue);
//        originPool.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
//
//
//        // 测试
//        for (int i = 0; i < 15; i++) {
//            originPool.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep((long) (Math.random() * 5 + 1) << 8);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            System.out.printf("current pool size：%d, ", originPool.getPoolSize());
//            System.out.printf("current queue size：%d \n", originPool.getQueue().size());
//        }
//        originPool.shutdown();
    }

}


