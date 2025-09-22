public class Encapsulation {
    public static void main(String[] args) {
        Bike bike = new Bike("Honda","50","black");

        System.out.println(bike.getColour());

        bike.setColour("white");

        System.out.println(bike.getColour());
    }
}

class Bike {
    private String make;
    private String model;
    private String colour;

    Bike(String make, String model, String colour){
        this.setMake(make);
        this.setColour(colour);
        this.setModel(model);
    }

//    getter methods

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

//    setter methods

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
