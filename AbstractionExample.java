abstract class Machine {
    abstract void on(); // abstract method
}

class WashingMachine extends Machine {
    void on() {
        System.out.println("The driver is driving the car");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Machine v = new WashingMachine(); // upcasting
        v.on();
    }
}
