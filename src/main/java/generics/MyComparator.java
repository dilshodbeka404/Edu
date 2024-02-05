package generics;

import java.util.Comparator;
import java.util.Objects;

public class MyComparator implements Comparator<Integer> {
    //THIS is a "bridge method"
    public int compare(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("Argument is null");
        }
        if (Objects.equals(a, b)) {
            return 0;
        }
        return (a > b) ? 1 : -1;
    }
}
