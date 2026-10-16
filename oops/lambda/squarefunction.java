package oops.lambda;
import java.util.function.*;

public class squarefunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }
}
