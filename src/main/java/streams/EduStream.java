package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dilshodbek Akhmedov, Wed 4:00 PM. 2/22/23
 */
public class EduStream {
    static List<String> elements = Stream.of("a", "b", "c")
            .filter(element -> element.contains("b"))
            .collect(Collectors.toList());

    //Another way of creating an infinite stream is by using the iterate() method:
    static Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

    //
    static List<String> list = Arrays.asList("abc1", "abc2", "2  abc3");
    static long counter = 0;

    static void wasCalled() {
        counter++;
    }

    static Stream<String> stream = list.stream().filter(element -> {
        wasCalled();
        return element.contains("2");
    });

    //data
    static List<Product> productList =
            Arrays.asList(
                    new Product(23, "potatoes"),
                    new Product(14, "orange"),
                    new Product(13, "lemon"),
                    new Product(23, "bread"),
                    new Product(13, "sugar")
            );


    //Custom collector
    static Collector<Product, ?, LinkedList<Product>> toLinkedList =
            Collector.of(LinkedList::new, LinkedList::add,
                    (first, second) -> {
                        first.addAll(second);
                        return first;
                    });

    static LinkedList<Product> linkedListOfPersons =
            productList.stream().collect(toLinkedList);


    public static void main(String[] args) {
//        System.out.println(elements);
//        streamIterated.forEach(a -> System.out.println("a = " + a));
//        stream.forEach(c -> System.out.println("c = " + c));
        linkedListOfPersons.forEach(p -> System.out.println("p = " + p));

    }
}
