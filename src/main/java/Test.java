import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * @author Dilshodbek Akhmedov, Fri 09:38. 12/08/22
 */
public class Test {
    static Map<String, String> map = new HashMap<>();

//    public static void main(String[] args) throws InterruptedException {
//        map.put("a", "b");
//        try {
//            String c = map.get("c");
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        int hash = Objects.hash(123, "null");
//        System.out.println("hash = " + hash);
//
//        collections.QueueSynchronized<String> queueSynchronized = new collections.QueueSynchronized<>(2) {{
//            collections.QueueSynchronized<String> hi = put("Hi");
//            collections.QueueSynchronized<String> salom = put("Salom");
//        }};
//
//        System.out.println("queueSynchronized.get() = " + queueSynchronized.get());
//        System.out.println("queueSynchronized.get() = " + queueSynchronized.get());
//        System.out.println("queueSynchronized.get() = " + queueSynchronized.get());
//        System.out.println('A' - 'b');
//        System.out.printf("The current shell is: %s.%n", System.getenv("SHELL"));
//
//        Set<Integer> test = new HashSet<>(Arrays.asList(1, 2, 3, 5));
//        Set<Integer> test2 = new HashSet<>(Arrays.asList(1, 3, 7, 9));
//        System.out.println(test.removeAll(test2));
//        System.out.println(test2.removeAll(test));
//        System.out.println(test);
//        System.out.println(test2);
//
//    }

    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }

    public  void maain(String[] args) {
//        BigDecimal decimal = BigDecimal.valueOf(1448.51048);
//        decimal = decimal.setScale(0, RoundingMode.CEILING);
//        System.out.println("decimal = " + decimal);
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        System.out.println(uuidAsString);

        System.out.println(String.valueOf(System.currentTimeMillis()));
    }

    private static Map<Object, Object> manaMap(Object... obb) {
        Map<Object, Object> map = new HashMap<>();
        Object key = null;
        for (Object o : obb) {
            if (Objects.nonNull(key)) {
                map.put(key, o);
                key = null;
            } else key = o;
        }
        return map;
    }

    public static void main(String[] args) {
        double amountKZT = 51.45684415;
    }
}
