package multi_thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Jum 14:57. 25/11/22
 */
public class Atomic {
    volatile Integer integer1 = 1;

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(6);
        for(Integer i : myList){
            System.out.println("i = " + i);
            if(i.equals(4)){
                myList.add(5);
            }
        }

    }
}
