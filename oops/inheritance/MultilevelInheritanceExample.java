package inheritance;

class Device {
    void powerOn() {
        System.out.println("Powering on the device.....");
    }
}
// Child class - 1
class BasicPhone extends Device {
    void makeCall() {
        System.out.println("Calling the number.....");
    }
}

// Child class - 2
class SmartPhone extends BasicPhone {
    void browseInternet() {
        System.out.println("Opening Browser.....");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();
        samsung.browseInternet();
        samsung.makeCall();
        samsung.powerOn();
    }
}