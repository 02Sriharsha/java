class addition{
    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(Float a, Float b, Float c){
        System.out.println(a+b+c);
    }

    void sum(Double a,Double b){
        System.out.println(a+b);
    }

    static void change(int[] arr){
        arr[0] = 78;
    }
}

public class test2 {
    public static void main(String[] args) {
        addition obj = new addition();
        int[] marks = {10,20,30,40};
        addition.change(marks);
        System.out.println(marks[0]);
        obj.sum(10,20);
        obj.sum(23.67,45.89);
        obj.sum(34.4f,67.7f,45.8f);
    }
}
