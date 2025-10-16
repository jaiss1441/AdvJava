class InnerThread4 implements Runnable{
    public void run(){
       for(int i = 0; i < 5; i++){
           try {
               System.out.println("hi");
               Thread.sleep(10);
           } catch (InterruptedException ex) {
           }
       }
    }
}
class OutterThread4 implements Runnable{
       public void run(){
       for(int i = 0; i < 5; i++){
           try {
               System.out.println("hello");
               Thread.sleep(10);
           } catch (InterruptedException ex) {
           }
       }
    }
}

public class RunnableInterfaceThread {
    public static void main(String[] args){
        Runnable in = new InnerThread4();
        Runnable out = new OutterThread4();

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);

        t1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
        }
        t2.start();

    }
}
