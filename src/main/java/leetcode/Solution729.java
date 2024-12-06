package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution729 {
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        List<Pair> pairs = Arrays.asList(
            new Pair(97, 100),
            new Pair(33, 51),
            new Pair(89, 100),
            new Pair(83, 100),
            new Pair(75, 92),
            new Pair(76, 95),
            new Pair(19, 30),
            new Pair(53, 63),
            new Pair(8, 23),
            new Pair(18, 37),
            new Pair(87, 100),
            new Pair(83, 100),
            new Pair(54, 67),
            new Pair(35, 48),
            new Pair(58, 75),
            new Pair(70, 89),
            new Pair(13, 32),
            new Pair(44, 63),
            new Pair(51, 62),
            new Pair(2, 15)
        );

        for (Pair pair : pairs) {
            System.out.println("book(" + pair.start + ", " + pair.end + ") = " + myCalendar.book(pair.start, pair.end));
        }
    }


    static class MyCalendar {

        List<Pair> calendar;

        public MyCalendar() {
            this.calendar = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (Pair pair : calendar) {
                if (
                    pair.start <= start && pair.end > start ||
                    pair.start < end && pair.end >= end ||
                    pair.start >= start && pair.end <= end
                )
                    return false;
            }
            calendar.add(new Pair(start, end));
            return true;
        }
    }                                                       // [13,32]

    static class Pair {
        int start;
        int end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

}
