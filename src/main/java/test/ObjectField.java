package test;

public class ObjectField {

    private String name = "HHH";
    private Integer age = 22;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectField{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ObjectField objectField = new ObjectField();
        System.out.println("objectField = " + objectField);

        System.out.println("objectField = " + change(objectField));

        System.out.println("objectField = " + objectField);

        Integer a = null;
        boolean is = a > 0;
        System.out.println("is = " + is);
    }

    private static ObjectField change(ObjectField objectField) {
        ObjectField obj = new ObjectField();
        obj = objectField;
        objectField.setAge(25);
        return objectField;
    }


}
