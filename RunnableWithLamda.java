public class RunnableWithLamda {
    public static void main(String[] args) {
        Runnable in = () ->{
            for(int i = 0; i < 5; i++){
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                }
            }
        };

        Runnable out = () ->{
            for(int i = 0; i < 5; i++){
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                }
            }
        };

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);

        t1.start();
        t2.start();
    }
}
