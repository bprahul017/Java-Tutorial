public class DynamicPolymorphism {
    public static void main(String[] args) {
        Fish catfish = new Catfish("River");
        Fish salmon = new Salmon("Sea");

        System.out.println(catfish.live());
        System.out.println(salmon.live());
    }
}

abstract class Fish {
    String live(String livesIn) {
        return "leaves in " + livesIn;
    }

    abstract String live();
}

class Salmon extends Fish {
    String livesIn;

    Salmon(String livesIn) {
        this.livesIn = livesIn;
    }

    @Override
    String live() {
        return super.live(this.livesIn);
    }
}

class Catfish extends Fish {
    String livesIn;

    Catfish(String livesIn){
        this.livesIn = livesIn;
    }

    @Override
    String live() {
        return super.live(this.livesIn);
    }
}