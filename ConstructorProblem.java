class Human {
    String name;
    int age;

    // Constructor
    Human(String n, int a) {
        name = n;
        age = a;
    }
}

public class ConstructorProblem {
    public static void main(String[] args) {
        // Object creation, constructor is called
        Human person1 = new Human("Rahul", 22);
        System.out.println(person1.name + " is " + person1.age + " years old.");
    }
}
