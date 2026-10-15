package oops.generics;

public class generic1 {

    // Multi type parameters
static class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }
}

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Age", 25);

        String k = p.getKey();
        Integer v = p.getValue();

        System.out.println(k + ":" + v);
    }
}
    
