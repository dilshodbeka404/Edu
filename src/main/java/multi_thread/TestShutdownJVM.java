package multi_thread;

import java.util.concurrent.CompletableFuture;

/**
 * @author Dilshodbek Akhmedov, Sesh 10:53. 15/11/22
 */
public class TestShutdownJVM {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
            Thread.sleep(100);
            if (i == 45) {
                CompletableFuture.runAsync(() -> {
                            for (int j = 0; j < 100; j++) {
                                System.out.println("j = " + j);
                                try {
                                    Thread.sleep(100);
                                    if (j == 25) {
//                                        System.exit(100);
                                    Runtime.getRuntime().halt(100);
                                    }
                                } catch (InterruptedException e) {
                                    System.out.println("j = " + j);
                                }
                            }
                        }
                );
            }
        }
    }
}
