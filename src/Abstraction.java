abstract class Abstraction1{
    abstract void hello();
    abstract void hello2();
}

class Greet extends Abstraction1{
    @Override
    public void hello() {
        System.out.println("Good Morning");
    }

    public void hello2() {
        System.out.println("Good AfterNoon");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.hello();
        obj.hello2();
    }
}
