class InnerThreadsExp1 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hi");
        }
    }
    
}

class OutterTHreadExp1 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello");
        }
        
    }
}


public class ThreadsExp1 {
    public static void main(String[] args) {
        InnerThreadsExp1 in = new InnerThreadsExp1();
        OutterTHreadExp1 out = new OutterTHreadExp1();

        in.start();
        out.start();
    }
}
