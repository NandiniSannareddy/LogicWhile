abstract class First {
    abstract void sum(int a, int b);

    abstract void mul(int a, int b);
}

abstract class Second extends First {
    void sum(int a, int b) {
        System.out.println("a+b=" + (a + b));
    }

    abstract void mul(int a, int b);
}

class Third extends Second {
    void mul(int a, int b) {
        System.out.println("a*b=" + (a * b));
    }
}

public class AbstractTwo {
    public static void main(String[] args) {
        Third t = new Third();
        t.mul(3, 5);
        t.sum(10, 20);
    }
}
