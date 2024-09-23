package data;

import lombok.Getter;

public class ClassInstance {
    private static ClassInstance instance;

    @Getter
    private int a;

    private ClassInstance() {
    }

    public void setA(int a) {
        this.a = a;
    }

    public static ClassInstance getClassInstance() {
        if (instance == null) {
            instance = new ClassInstance();
        }
        return instance;

    }

    @Override
    public String toString() {
        return "ClassInstance{" + "a=" + a + '}';
    }

    public static void main(String[] args) {
        Integer x = 5;
        Double y = 5.5;
        String s = "Hello";
        System.out.println(x instanceof Integer); // Bu "true" ni chiqaradi
        System.out.println(y instanceof Double);  // Bu "true" ni chiqaradi
        System.out.println(s instanceof String); // Bu "true" ni chiqaradi
    }
}
