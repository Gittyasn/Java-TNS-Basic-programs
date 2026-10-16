package oops.lambda;

public class Greeter {
    @FunctionalInterface
    interface Greeting {
        void greet(String name);
    }

    public static void main(String[] args) {
        Greeting g = (name) -> System.out.println("Hello " + name);
        g.greet("Yash");
    }
}

