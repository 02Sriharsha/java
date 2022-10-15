class A{
    public void hello() {
        System.out.println("This is method of class A");
    }
}

class B extends  A{
    public void hello(){
        System.out.println("This is method of class B");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        A obj = new B();
        B obj1 = new B();
        obj.hello();
        obj1.hello();
    }
}
