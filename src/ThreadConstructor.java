class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
//        while(true){
//            System.out.println("This is a thread");
//        }
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr obj = new MyThr("harsha");
        obj.start();
        obj.setPriority(5);
        obj.setName("Sriharsha");
        MyThr obj1 = new MyThr("harsha");
        obj1.start();
        System.out.println("The id of this thread is : "+obj.getId());
        System.out.println("The name of this thread is : "+obj.getName());
        System.out.println("The priority of this thread is : "+ obj.getPriority());
        System.out.println("The id of this thread is : "+obj1.getId());

    }
}
