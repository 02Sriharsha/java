import java.sql.* ;
interface Greet1{
    public void hello();
}

interface sum{
    public void add(int ...arr);
}

class Greet2 implements Greet1 , sum{
    @Override
    public void hello() {
        System.out.println("Good Morning");
    }

    @Override
    public void add(int ...arr) {
        int sum=0;
        for(int element:arr){
            sum = sum+element;
        }
        System.out.println(sum);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Greet2 obj = new Greet2();
        obj.hello();
        int[] arr = {1,2,3,4};
        obj.add(arr);
    }
}
