import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethodsExp2 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,4,6,1,8,9);

        Stream<Integer> sortedValue = num.stream()
                                        .filter(n -> n % 2==0)
                                        .sorted();

        sortedValue.forEach(n -> System.out.println(n));
                        
    }
}
//filter method accept Predicate type object 
//Predicate is an Functional Interface which have test boolean method
//Like filter every method arequired diff interface type object 
//and that function have some method 
//for example map method required Function type object
//Function is also Functional Interface which have apply method
//So we can use Lambda expression to provide implementation of that method
//like n->n%2==0 is implementation of test method of Predicate interface
//and n->n*2 is implementation of apply method of Function interface
//So we can use Lambda expression to provide implementation of that method