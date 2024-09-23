package streams;

import java.util.List;

public class ReduceStream {

    public static void main(String[] args) {
        List<Long> list = List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L);
        list.stream()
            .min((o1, o2) -> Long.compare(o2, o1))
            .ifPresent(System.out::println);
    }
}
