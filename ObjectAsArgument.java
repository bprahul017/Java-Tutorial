import javax.swing.*;

public class ObjectAsArgument {
    public static void main(String[] args) {
        Car car = new Car(JOptionPane.showInputDialog("Enter Car Name"), JOptionPane.showInputDialog("Enter Car Model"), JOptionPane.showInputDialog("Enter Car Colour"));
        Garage garage = new Garage(car, Integer.parseInt(JOptionPane.showInputDialog("Enter parking slot")));

    }
}

class Garage {
    Garage(Car car, int slot) {
        JOptionPane.showMessageDialog(null,car.toString()+"\tparked at\t"+slot);
    }
}

class Car {
    String name;
    String model;
    String colour;

    Car(String name, String model, String colour) {
        this.name = name;
        this.model = model;
        this.colour = colour;
    }


    public String toString() {
        return name+"\t"+model+"\t"+colour;
    }
}