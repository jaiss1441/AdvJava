class Counter{
    int count = 0;
    public synchronized  void increment(){
        count++;
    }
}
public class RaceConditionThread {
    public static void main(String[] args) {
        Counter c = new Counter();

        Runnable in = () ->{
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        };

        Runnable out = () ->{
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();

        try{
        t1.join();
        t2.join();
        }catch(Exception e){}
        System.out.println(c.count);

    }
}
