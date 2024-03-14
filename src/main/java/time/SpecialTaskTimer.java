package time;

import java.util.Arrays;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class SpecialTaskTimer extends TimerTask {
    public static void main(String[] args) {
        SpecialTaskTimer specialTaskTimer = new SpecialTaskTimer();
        specialTaskTimer.run();
    }
    @Override
    public void run() {
        long delay = 10L; // 5 minute
        try {
            String agentIds = "1,2,3,4";

            ConcurrentHashMap<String, String> map = Arrays
                    .stream(agentIds.trim().split(","))
                    .collect(Collectors.toMap(s -> s, s -> s, (o1, o2) -> o1, ConcurrentHashMap::new));

            System.out.println("map = " + map);
            TimeUnit.MILLISECONDS.sleep(delay);
            run();
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}