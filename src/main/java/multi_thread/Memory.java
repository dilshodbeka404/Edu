package multi_thread;

public class Memory {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("runtime = " + runtime.toString());

        long totalMemory = runtime.totalMemory();
        System.out.println("totalMemory = " + totalMemory);

        long freeMemory = runtime.freeMemory();
        System.out.println("freeMemory = " + freeMemory);

        long maxMemory = runtime.maxMemory();
        System.out.println("maxMemory = " + maxMemory);

        int availableProcessors = runtime.availableProcessors();
        System.out.println("availableProcessors = " + availableProcessors);
    }
}
