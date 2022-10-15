public class varArgs {
    static int sum(int a,int b){
        return a+b;
    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }

    //varArgs instead of overloading
    static int sum(int ...arr){
        int sum=0;
        for(int element:arr){
            sum = sum+element;

        }
        return sum;
    }

    //varArgs with atleast one argument
    static int sum1(int x,int ...arr){
        int sum=x;
        for(int element:arr){
            sum = sum+element;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(23,56));
        System.out.println(sum(23,56,78,67,34,2,3,4,5,77,9));
        System.out.println("Sum of nothing is : "+sum());
        System.out.println("Sum of atleast one value is : "+sum1(10));
    }
}
