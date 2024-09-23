package multi_thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dilshodbek Akhmedov, Jum 14:57. 25/11/22
 */

@Slf4j
public class Atomic {

    private static final int LIMIT = 100_000;
    private static final int THREAD_COUNT = 5;
    private static final int TOTAL_OFFSET = 100_000_111;
    private static final AtomicInteger offset = new AtomicInteger(0);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        for (int i = 0; i < THREAD_COUNT; i++) {
            executorService.execute(migrationTask());
        }
        executorService.shutdown();
    }

    private static Runnable migrationTask() {
        return () -> {
            while (offset.get() <= TOTAL_OFFSET) {
                log.info("limit: {} offset: {}", LIMIT, offset.getAndAdd(LIMIT));
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }

            }
        };
    }
}
