interface First {
    abstract void sum(int a, int b);

    abstract void mul(int a, int b);
}

class Second implements First {
    public void sum(int a, int b) {
        System.out.println("a+b=" + (a + b));
    }

    public void mul(int a, int b) {
        System.out.println("a*b=" + (a * b));
    }
}

public class Interface {
    public static void main(String[] args) {
        Second sc = new Second();
        sc.sum(20, 10);
        sc.mul(3, 5);
    }
}
