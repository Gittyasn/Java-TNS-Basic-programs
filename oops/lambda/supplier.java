package oops.lambda;
import java.util.function.Supplier;
public class supplier {
    public static void main(String[] args) {
        Supplier<String> getname = () -> "Yash";
        System.out.println(getname.get());
    }
}
