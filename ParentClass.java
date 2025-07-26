class Parent {
    int a;
    int b;

    void sum() {
        System.out.println("Sum of a and b is " + (a + b));
    }

    void diff(int a, int b) {
        System.out.println("Difference between a and b is " + (a - b));
    }

}

class Child extends Parent {
    Child(int a, int b) {
        super.a = a;
        super.b = b;
        super.sum();
        super.diff(10, 5);
    }
}

public class ParentClass {
    public static void main(String[] args) {
        Child obj = new Child(20, 40);
    }
}
