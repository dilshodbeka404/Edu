package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * @author Dilshodbek Akhmedov, Fri 3:02 PM. 2/10/23
 */
public class StringToMap {
    static ConcurrentMap<String, String> SPECIAL_AGENT_ID = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        String text = "tg_1:111,tg_2:222,tg_3:333";

        Map<String, String> map = Arrays.stream(text.split(","))
                .map(s -> s.split(":", 2))
                .collect(Collectors.toMap(s -> s[0].trim(),
                        s -> s[1].trim()));
        System.out.println("map = " + map);


        specialAgentIds();

    }

    private static void specialAgentIds() {
        SPECIAL_AGENT_ID.put("9", "9");
        SPECIAL_AGENT_ID.put("8", "8");
        SPECIAL_AGENT_ID.put("7", "7");

        System.out.println("SPECIAL_AGENT_ID = " + SPECIAL_AGENT_ID);

        String agentIds = "1,2,3,4,5";
        System.out.println("agentIds = " + agentIds);

        SPECIAL_AGENT_ID = Arrays
                .stream(agentIds.trim().split(","))
                .collect(Collectors.toMap(s -> s, s -> s, (o1, o2) -> o1, ConcurrentHashMap::new));

        System.out.println("SPECIAL_AGENT_ID = " + SPECIAL_AGENT_ID);
    }
}
