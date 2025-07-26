class Student {
    String name;
    double marks;
    int roll;

    Student() {
        name = "Nandini";
        marks = 989;
    }

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        System.out.println(this.name);
        System.out.println(this.marks);
    }

    Student(String name) {

        System.out.println(name);
    }

}

public class ConstructorOverload {
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println(std.name + " " + std.marks + " " + std.roll);
    }
}
