
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExp1 {
    //It is use to Short Collection wiht help Comparetor Interface it is Functional InterFace
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(3);
        num.add(8);
        num.add(7);
        num.add(1);

        Collections.sort(num);
        //sort() method is used to short Collection Object/Values
        //by default sort() method have its own sorting logic 
        //if we want to write our own login we use Comparator Interface
        
        System.out.print(num);
    }
}
