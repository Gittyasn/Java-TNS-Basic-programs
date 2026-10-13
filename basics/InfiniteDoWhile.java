package basics;

public class InfiniteDoWhile {
    public static void main(String[] args) {
        do {
            System.out.println("Loop is running. Press Ctrl+C to stop.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.println("Loop interrupted.");
                break;
            }
        } while (true);
    }
}