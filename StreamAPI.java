import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> s1 = num.stream(); // Creating a stream from the list 'num'
        
        s1.forEach(n -> System.out.println(n)); // Using forEach method to print
      
    }
}
