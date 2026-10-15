package oops.generics;

public class util {
    public static <T> void print(T value) {
        System.out.println(value);
    }

    public static <T> T firstoff(T a, T b) {
        return b;
    }

    public static void main(String[] args) {
        util.print("Hello");
        System.out.println(util.firstoff("a", "b"));
    }
}