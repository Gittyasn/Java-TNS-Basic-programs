package oops.lambda;
import java.util.function.Consumer;
public class consumer {
    public static void main(String[] args) {
        Consumer<String> print = name -> System.out.println("Hello " + name);
        print.accept("Yash");
    }
}
