package oops.lambda;
// one parameter : x -> x*2
// two parameters : (x,y) -> x+y
// multiple parameters : (x,y,z) -> x+y+z
// no parameters : () -> System.out.println("Hello");
// (int a,int b) -> a+b


/*
1. predicate <T> test<t>T -> t/f 1/0

2.Function <T,R> :apply (t); T ->R

3.Consumer<T> :accept(t); void     hi  .accept()

4.Supplier<T> :get(); T
*/


import java.util.function.*;

public class function {
    public static void main(String[] args) {
        Function<String, Integer> getlength = name -> name.length();
        System.out.println(getlength.apply("Yash"));
    }
}
