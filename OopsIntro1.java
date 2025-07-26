/* class Student {
    String name;
    int rollno;
    double marks;

    void display() {
        System.out.println(name + " " + rollno + " " + marks);
    }
} */

/* class Student {
    static String name;
    static int rollno;
    static double marks;

    static void display() {
        System.out.println(name);
    }
} */

/*
 * public class OopsIntro1 {
 * String name;
 * int rollno;
 * double marks;
 * 
 * void display() {
 * System.out.println(name + " " + rollno + " " + marks);
 * }
 * 
 * public static void main(String[] args) {
 * OopsIntro1 std = new OopsIntro1();
 * std.name = "Nandini";
 * std.rollno = 510;
 * std.marks = 989;
 * std.display();
 * }
 * }
 */
/* class Student {
    String name;
    int rollno;
    double marks;

    void display(String name) {
        System.out.println(name);
    }
} */

/* class Student {
    String name = "Nandini";
    int rollno = 510;
    double marks = 989;

    void display(String name, int roll, double marks) {
        System.out.println(name + " " + roll + " " + marks);
    }
} */

/* class Student {
    String name;
    int rollno;
    double marks;

    void display(String name, int roll, double marks) {
        System.out.println(name + " " + roll + " " + marks);
    }

    Student() {
        name = "Nandini";
        rollno = 510;
        marks = 989;
    }

} */

/* public class OopsIntro1 {

    public static void main(String[] args) {

        Student std = new Student();
        std.display(std.name, std.rollno, std.marks);

    }
} */

public class OopsIntro1 {
    String name;
    int roll;

    public static void main(String[] args) {

        OopsIntro1 std = new OopsIntro1("Nandini", 501);
        std.display(std.name, std.roll);

    }

    OopsIntro1(String n, int roll) {
        name = n;
        this.roll = roll;
    }

    void display(String name, int rollNO) {
        System.out.println("My name is " + name);
        System.out.println("Roll no is: " + rollNO);
    }
}