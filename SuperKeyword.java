public class SuperKeyword {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Rahul", 29, "Fooding");
        System.out.printf("Name: %s \n Age: %d \n Power: %s", hero1.name, hero1.age, hero1.power);

        Hero hero2 = new Hero("Abhi",28,"Flying");
        System.out.println(hero2.toString());
    }

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n name: " + this.name + "\nAge: " + this.age;
    }
}

class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + "\n power: " + this.power;
    }
}
