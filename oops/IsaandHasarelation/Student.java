package IsaandHasarelation;

// static keyword creates a class-level variable.
// It is shared by all objects of the class.

public class Student {
    String name; // Instance variable
    static String college = "ITS"; // Static variable

    Student(String name) {
        this.name = name;
    }

    public void stucol() {
        System.out.println(name + " studies in " + Student.college);
    }
}
