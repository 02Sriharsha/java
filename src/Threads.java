class runnable1 implements Runnable{
        @Override
        public void run() {
            for(int i=0; i<150; i++) {
                System.out.println("I am a thread 1");
            }
        }
    }
class runnable2 implements Runnable{
        @Override
        public void run() {
            for(int i=0; i<510; i++) {
                System.out.println("I am a thread 2");
            }
        }
    }


public class Threads {
    public static void main(String[] args) {
        runnable1 t1 = new runnable1();
        Thread r1 = new Thread(t1);
        runnable2 t2 = new runnable2();
        Thread r2 = new Thread(t2);
        r1.start();
        r2.start();


    }
}
