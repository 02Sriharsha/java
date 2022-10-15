import java.io.FileNotFoundException;
import java.io.FileReader;

class LessThanOneException extends Exception {
    public LessThanOneException(String str) {
        super(str);
    }
}

class CustomException {
    public void Calculate(int a, int b) throws LessThanOneException {
        if (a <= 1 || b <= 1) {
            throw new LessThanOneException("Error occurred");
        } else {
            int x = a + b;
            System.out.println(x);
        }
    }
}

public class exceptionHandling {
    public static void main(String[] args){
        try {
        FileReader fr = new FileReader("harsha.txt");
            int[] ar = new int[100];
            ar[99] = 88;
            System.out.println(ar[199]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        CustomException obj = new CustomException();
        int a = 10, b = 0;
        try {
            obj.Calculate(a, b);
        } catch (LessThanOneException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Exception executed successfully");
        }
    }

}
