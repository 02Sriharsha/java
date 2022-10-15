
class Modifiers{
     public int a = 5;
     int b = 6;
     private int c;
     protected int d = 8;

     public void setNumber(int c){
         this.c = c;
     }

     public int getNumber(){
         return this.c;
     }

}

public class AccessModifiers {
    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.setNumber(20); //private modifier cannot be accessed in the same package, have to use methods to access.
        System.out.println(obj.getNumber());
        System.out.println(obj.d);

    }
}
