class College {
    void id() {
        System.out.println("College id is NBKRIST");
    }
}

class Faculty extends College {
    @Override
    void id() {
        System.out.println("Faculty id is 500");
    }
}

class Student extends Faculty {
    @Override
    void id() {
        System.out.println("Student id is 1000");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        College ob = new College();
        ob.id();
        ob = new Faculty();
        ob.id();
        ob = new Student();
        ob.id();
    }
}
