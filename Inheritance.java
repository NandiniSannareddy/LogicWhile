class School {
    void name() {
        System.out.println("College name is NBKRIST");
    }
}

class Student extends School {
    void display(String name) {
        System.out.println("My name is " + name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student std = new Student();
        std.name();
        std.display("Nandini");
    }
}
