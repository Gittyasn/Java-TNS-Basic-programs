package oops.lambda;
import java.util.function.Consumer;
public class consumerphone {
    public static void main(String[] args) {
        Consumer<String> smsNotifier = mobile ->
        {
             System.out.println("sending the repository " + mobile);
        };      
        smsNotifier.accept("1234567890");
        
    }
}
