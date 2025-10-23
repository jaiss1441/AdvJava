
import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExp {
    public static void main(String[] args) {
        Collection<Integer> arr = new ArrayList<Integer>();
        //if we did't mention which type of collection it is it will give run time exception
        //so aviding that you have to mention type 
        //becouse of that if try to add another type of value it will give compile time error

        arr.add(12);
        arr.add(13);
        arr.add(14);
        
        for(int n : arr){
            System.out.println(n);
        }
    }
}
