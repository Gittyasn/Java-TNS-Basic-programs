package inheritance;

class Shape {
    String color = "Blue";
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle " + color + " circle");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a Rectangle " + color + " Rectangle");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.drawCircle();
        Rectangle r = new Rectangle();
        r.drawRectangle();
    }
}
