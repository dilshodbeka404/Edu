public class TestClass {

    void probe(Object x) {System.out.println("In Object");}
    void probe(Number x) {System.out.println("In Number");}
    void probe(Integer x) {System.out.println("In Integer");}
    void probe(Long x) {System.out.println("In Long");}

    public static void main(String[] args) {
        double a = 10;
        new TestClass().probe(a);

        System.out.println("" + 5 + 6);
        System.out.println(5 + "" + 6);
        System.out.println(5 + 6 + "");
        System.out.println(5 + 6);

        One o = null;
        Two t = new Two();

        System.out.println("t = " + "'" + null + "'");
    }

}

class Super {
    static { System.out.println("Super"); }
}
class One {
    static { System.out.println("One"); }
}
class Two extends Super {
    static { System.out.println("Two"); }
}
