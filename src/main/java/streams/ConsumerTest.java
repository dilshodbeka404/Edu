package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        // Consumer to display a number
        Consumer<Integer> display = System.out::println;

        // Implement display using accept()
        display.accept(10);

        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer>> modify = list -> list.replaceAll(integer -> 2 * integer);

        // Consumer to display a list of numbers
        Consumer<List<Integer>> displayList = list -> list.forEach(System.out::println);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        // Implement modify using accept()
        modify.accept(list);

        // Implement displayList using accept()
        displayList.accept(list);

        // using addThen()
        modify.andThen(displayList).accept(list);
    }

}
