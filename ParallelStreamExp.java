import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamExp {

    public static void main(String[] args) {
        int size = 10000;
        List<Integer> list = new ArrayList<>(size);

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            list.add( rand.nextInt(100));
        }

      long start1 = System.currentTimeMillis();
        int sun2 = list.stream()
                        .map(n ->{
                                try{    
                                    Thread.sleep(1);
                                     } // to simulate some delay
                                catch(Exception ex){ }

                                return n * 2;  // we can also use block body in lambda expression
                                            // like this
                           
                            })
                        .mapToInt(i ->  i)
                        .sum();
        long end1 = System.currentTimeMillis();

        long paraStart = System.currentTimeMillis();
        int sum3 = list.parallelStream()
                      .map(n ->{
                                try{    
                                    Thread.sleep(1);
                                     } // to simulate some delay
                                catch(Exception ex){ }

                                return n * 2;  // we can also use block body in lambda expression
                                            // like this
                           
                            })
                      .mapToInt(i -> i)
                      .sum();
        long paraEnd = System.currentTimeMillis();
                      
       System.out.println(+ sun2 + " " + sum3);
       System.out.println("Time taken in sequential stream: " + (end1 - start1) + " ms");
       System.out.println("Time taken in parallel stream: " + (paraEnd - paraStart) + " ms");
    }
}
// Output may vary but parallel stream should be significantly faster due to simulated delay
/* Example Output:
99000 99000 
Time taken in sequential stream: 10045 ms
Time taken in parallel stream: 2534 ms
*/
//parallelStream() uses multiple threads to process the elements concurrently,
// which can lead to significant performance improvements for large datasets or time-consuming operations.  
// In contrast, stream() processes elements sequentially in a single thread.
// This example demonstrates the performance difference between the two approaches.
// The simulated delay of 1 millisecond per element amplifies the performance difference.
