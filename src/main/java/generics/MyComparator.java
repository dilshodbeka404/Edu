package generics;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {
    //THIS is a "bridge method"
    public int compare(Object a, Object b) {
        return compare((Integer)a, (Integer)b);
    }
}
