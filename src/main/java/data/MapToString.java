package data;

import java.util.HashMap;
import java.util.Map;

public class MapToString {
    public static void main(String[] args) {
        Map<String, String> headersMap = new HashMap<>();
        headersMap.put("key1", "value1");
        headersMap.put("key2", "value2");
        headersMap.put("key3", "value3");
        headersMap.put("key4", "value4");
        String string = headersMap.toString();
        System.out.println("==================== Headers ====================\n" + string + "\n=================================================");
        ClassInstance classInstance = ClassInstance.getClassInstance();
        System.out.println("classInstance = " + classInstance);
        classInstance.setA(5);
        System.out.println("classInstance = " + classInstance);
    }
}
