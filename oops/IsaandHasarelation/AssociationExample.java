package IsaandHasarelation;

public class AssociationExample {
    public static void main(String[] args) {

        Student s1 = new Student("Yash");
        Student s2 = new Student("Yaswanth");

        System.out.println("College name is: " + Student.college);

        s1.stucol();
        s2.stucol();
    }
}
