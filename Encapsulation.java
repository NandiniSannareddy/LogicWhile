class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Nandini");
        System.out.println(std.getName());
        std.setName("Sowmya");
        System.out.println(std.getName());
    }
}
