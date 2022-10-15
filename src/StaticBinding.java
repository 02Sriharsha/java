public class StaticBinding {
    private void eat()
    {
        System.out.println("Animal is eating");
    }

    public static void main(String[] args)
    {
        StaticBinding obj = new StaticBinding();
        obj.eat();
    }
}
