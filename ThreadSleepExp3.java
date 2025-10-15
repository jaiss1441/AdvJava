class InnerThread3 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                System.out.println("hi");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}
class OutterThread3 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
           try {
                System.out.println("hello");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }    
}

public class ThreadSleepExp3 {
    public static void main(String[] args) {
        InnerThread3 in = new InnerThread3();
        OutterThread3 out = new OutterThread3();
        in.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException ex) {
        }
        out.start();
    }
}
