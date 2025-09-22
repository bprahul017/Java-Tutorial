import javax.swing.*;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        Fish fish;

        String selectedFish = JOptionPane.showInputDialog("Enter a fish");

        switch (selectedFish) {
            case "catFish":
                fish = new Catfish("River");
                JOptionPane.showMessageDialog(null, selectedFish + fish.live());
                break;

            case "salmon":
                fish = new Salmon("Sea");
                JOptionPane.showMessageDialog(null, selectedFish + fish.live());
                break;

            default:
                JOptionPane.showMessageDialog(null, "Option not found");
                break;

        }

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

    Catfish(String livesIn) {
        this.livesIn = livesIn;
    }

    @Override
    String live() {
        return super.live(this.livesIn);
    }
}