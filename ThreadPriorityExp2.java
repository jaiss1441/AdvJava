
import static java.lang.Thread.MAX_PRIORITY;



class InnerThreadsExp2 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("hi");
        }
    }
}

class OutterTHreadExp2 extends Thread{
  public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello");
        }
    }
}

public class ThreadPriorityExp2 {
    public static void main(String[] args) {
        InnerThreadsExp2 in = new InnerThreadsExp2();
        OutterTHreadExp2 out = new OutterTHreadExp2();
        in.setPriority(MAX_PRIORITY);
        System.out.println(in.getPriority());
    }
}
