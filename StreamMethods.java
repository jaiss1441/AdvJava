import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> s1 = num.stream()// Creating a stream from the list 'num'
                                .filter(n -> n % 2==0); // Filtering even numbers

        Stream<Integer> s2 = s1.map(n -> n * 2); // Mapping to square the numbers

        Stream<Integer> s3 = s2.sorted(); // Sorting the squared numbers

        s3.forEach(n -> System.out.println(n)); // Using forEach method to print
    }
}
//Stream API in Java
// Introduced in Java 8, the Stream API provides a modern way to process sequences of elements (like collections) in a functional style.
// It allows for operations such as filtering, mapping, and reducing data.  
//Objects of streams used only once.
// Once a stream has been operated upon or consumed, it cannot be reused.   
// This is because streams are designed to be single-use and to support efficient processing of data.
// If you need to perform multiple operations on the same data, you should create a new stream