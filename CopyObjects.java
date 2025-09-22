public class CopyObjects {
    public static void main(String[] args) {

        Bus bus = new Bus("Kozhikode", 6754);
        Bus bus1 = new Bus(bus);


        System.out.println(bus1);
        System.out.println(bus);
        System.out.println();
        System.out.println(bus.getNumber());
        System.out.println(bus.getRoute());
        System.out.println();
        System.out.println(bus1.getNumber());
        System.out.println(bus1.getRoute());
        System.out.println();
    }
}

class Bus {
    private String route;
    private int number;

    Bus(String route, int number) {
        setNumber(number);
        setRoute(route);
    }

    Bus(Bus bus){
        this.copy(bus);
    }

    public int getNumber() {
        return number;
    }

    public String getRoute() {
        return route;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void copy(Bus x){
        this.setRoute(x.getRoute());
        this.setNumber(x.getNumber());
    }
}