package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Joy
 * @Date 2021/8/15
 */
//public class ThreadTest {
//    public static void main(String[] args) {
//
//        ExecutorService executorService = Executors.newCachedThreadPool();
////        // shutdown test
////        executorService.execute(() -> {
////            try {
////                Thread.sleep(2000);
////                System.out.println("thread run");
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        });
////        executorService.shutdownNow();
////        System.out.println("main");
//        // future test
//        Future<?> submit = executorService.submit(() -> {
//            System.out.println("submit");
//        });
//        submit.cancel(true);
//        System.out.println("main");
//    }
//
//}

class WaitForNotify{
    public synchronized void before(){
        System.out.println("before");
        notify();
    }

    public synchronized void after(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        WaitForNotify waitForNotify = new WaitForNotify();
        service.execute(waitForNotify::after);
        service.execute(waitForNotify::before);

    }
}