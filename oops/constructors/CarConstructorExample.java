package constructors;

public class CarConstructorExample {
    public static void main(String[] args) {
        Car car = new Car("Blue", "BMW", 360);
        car.displayInfo();
        car.accelerate(50);
    }
}

class Car {
    private final String color;
    private final String brand;
    private int speed;

    Car(String color, String brand, int speed) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println(brand + "\n" + color + "\n" + speed);
    }

    void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " accelerated to " + speed + " Km/hr");
    }
}
