class Student {
    void display(int a) {
        System.out.println(a * a);
    }

    int display(int a, int b) {
        return (a * b);
    }

    double display(double a, double b) {
        return a + b;
    }

}

public class MethodOverload {
    public static void main(String[] args) {
        Student std = new Student();
        std.display(10);
        int res = std.display(5, 6);
        double res1 = std.display(2.5, 3.4);

        System.out.println(res);
        System.out.println(res1);

    }
}
