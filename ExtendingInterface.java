interface First {
    abstract void sum(int a, int b);

}

interface Second extends First {
    abstract void mul(int a, int b);
}

interface Third extends Second {
    abstract void diff(int a, int b);
}

class Fourth implements Third {
    public void sum(int a, int b) {
        System.out.println("a+b=" + (a + b));
    }

    public void mul(int a, int b) {
        System.out.println("a*b=" + (a * b));
    }

    public void diff(int a, int b) {
        System.out.println("a-b=" + (a - b));
    }
}

public class ExtendingInterface {
    public static void main(String[] args) {
        Fourth f = new Fourth();
        f.sum(50, 50);
        f.diff(200, 100);
        f.mul(10, 10);
    }
}
