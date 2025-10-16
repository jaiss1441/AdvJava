class InnerThread4 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("hi");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class OutterThread4 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("hello");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

public class RunnableInterfaceThread {
    public static void main(String[] args) {
        Runnable in = new InnerThread4();
        Runnable out = new OutterThread4();
        // Objec type is Runnable but object of InnerTHread and OutterThread

        // When you implement Runnable Interface you can not call Thread Class start()
        // method
        // for that you have to create thread class object and in that object pass
        // object of InnerThread and OutterThread class object Runnable type like belove

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
