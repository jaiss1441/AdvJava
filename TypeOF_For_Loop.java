
import java.util.Arrays;
import java.util.List;

public class TypeOF_For_Loop{
    public static void main(String[] args) {
    List<Integer> num = Arrays.asList(1,2,3,4,5,6);

    // for(int i = 0; i < num.size(); i++){
    //     System.out.println(num.get(i)); // Accessing elements using for loop
    //     //Simple print statement to show the element at index i
    // }
    // for(Integer n : num){
    //     System.out.println(n); // Accessing elements using for-each loop
    //     //Simple print statement to show the element n
    //     //Enhanced for loop iterates through each element in the list
    // }
    num.forEach(n -> System.out.println(n)); // Accessing elements using forEach method with lambda expression
    // Simple print statement to show the element n
    // forEach method iterates through each element in the list using a lambda expression
}
}