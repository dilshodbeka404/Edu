package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution731 {

    class MyCalendarTwo {
        private final List<int[]> calendar;

        public MyCalendarTwo() {
            calendar = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            int startIndex = findInsertIndex(start);
            int endIndex = findInsertIndex(end);

            // Check for overlaps with existing bookings in the range.
            for (int i = startIndex; i < endIndex; i++) {
                if (Math.abs(calendar.get(i)[1]) > 1) {
                    // If any frequency exceeds 1, the booking cannot be made.
                    return false;
                }
            }

            // Calculate the new frequencies for the start and end times.
            int startFrequency = 1;
            if (startIndex > 0) {
                startFrequency = calendar.get(startIndex - 1)[1] + 1;
            }

            int endFrequency = -1;
            if (endIndex < calendar.size()) {
                endFrequency = calendar.get(endIndex)[1] - 1;
            }

            // Check if the new frequencies would cause a conflict.
            if (startFrequency > 2 || -endFrequency > 2) {
                return false;
            }

            // Update frequencies for all entries that overlap with the new booking.
            for (int i = startIndex; i < endIndex; i++) {
                calendar.get(i)[1] += 1; // Increase frequency
            }

            // Insert the new start and end times with their respective frequencies.
            calendar.add(startIndex, new int[]{start, startFrequency});
            calendar.add(endIndex + 1, new int[]{end, endFrequency});

            return true;
        }

        private int findInsertIndex(int time) {
            int low = 0;
            int high = calendar.size();
            while (low < high) {
                int mid = (low + high) / 2;
                if (calendar.get(mid)[0] < time) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }
}
