package oops.generics;

    class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {

        Box<String> b1 = new Box<>();
        b1.setValue("Hello");
        System.out.println(b1.getValue());

        Box<Integer> b2 = new Box<>();
        b2.setValue(100);
        System.out.println(b2.getValue());
    }
}

