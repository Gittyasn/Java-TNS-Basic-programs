package oops.lambda;

public class GreeterOld {
    @FunctionalInterface
    interface Greeter {
        public void greet(String name);
    }

    public static void main(String[] args) {
        Greeter g = new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        g.greet("Yash");
    }
}
