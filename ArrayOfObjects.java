class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Array to hold 3 Student objects
        Student[] students = new Student[3];

        // Initialize objects
        students[0] = new Student("Rahul", 21);
        students[1] = new Student("Sneha", 22);
        students[2] = new Student("Amit", 20);

        // Accessing
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " - " + students[i].age);
        }
    }
}
