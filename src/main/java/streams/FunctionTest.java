package streams;

import java.util.function.Function;

/**
 * java.util.function.Function
 * Java Interface Function<T,R>
 * <p>
 * Parameter Types:
 * T - the input given to the function
 * R - the result running the function
 * <p>
 * Popular SubInterface of Function: UnaryOperator<T>
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionClass functionClass = new FunctionClass();
        System.out.println(functionClass.apply(4));


        Function<Integer, String> verboseLambda = x -> Integer.toString(x * x);
        System.out.println(verboseLambda.apply(5));
    }

    static class FunctionClass implements Function<Integer, String> {
        @Override
        public String apply(Integer t) {
            return Integer.toString(t * t);
        }
    }


}