class base {
    base() {
        System.out.println("This is a base class constructor");
    }

    base(int x) {
        System.out.println("The value of x is : " + x);
    }
}

class child extends base {
    child() {
        System.out.println("This is a child class constructor");
    }

     child(int x, int y) {
        super(x);
        System.out.println("The sum of x and y is: "+(x+y));
    }
}

public  class Inheritance {
    public  static void main(String[] args) {
        base b1 = new base();
        child c1 = new child();
        child c2 = new child(10,20);

    }
}

