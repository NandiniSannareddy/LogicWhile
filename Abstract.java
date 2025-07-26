abstract class First {
    int a, b;

    First(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void sum();

    abstract void diff(int a, int b);
}

class Second extends First {
    Second(int a, int b) {
        super(a, b);
    }

    void sum() {
        System.out.println("a+b=" + (super.a + super.b));
    }

    void diff(int a, int b) {
        System.out.println("a-b=" + (a - b));
    }

}

public class Abstract {
    public static void main(String[] args) {
        Second sc = new Second(30, 20);
        sc.sum();
        sc.diff(50, 30);
    }
}
