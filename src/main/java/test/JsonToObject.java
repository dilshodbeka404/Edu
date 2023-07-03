package test;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class JsonToObject {

    static String json = "{\"name\":\"abc\",\"id\":101,\"branch\":\"CS\"}";


    @Getter
    @Setter
    @ToString
    class Obj {
        Long id;
        String name;
        Long branchId;
        String branch;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Obj obj = gson.fromJson(json, Obj.class);
        System.out.println("obj = " + obj.toString());
    }
}
