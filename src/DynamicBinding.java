class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
    }
}
