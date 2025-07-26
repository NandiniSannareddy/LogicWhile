interface First {
    abstract void display();
}

interface Second {
    abstract void display();
}

interface Third {
    abstract void display();
}

class Fourth implements First, Second, Third {
    public void display() {
        System.out.println("Bye, See you tomorrow!!");
    }
}

public class MultipleImplementing {
    public static void main(String[] args) {
        Fourth f = new Fourth();
        f.display();
    }
}
