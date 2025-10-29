
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithAnonymusClass {
    //It is use to Short Collection wiht help Comparetor Interface it is Functional InterFace
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>(){//Varaper claas mustbe mention
            public int compare(Integer i, Integer j){ // Mention Varaper class
                if(i%10 > j%10)
                return 1;
                else
                return -1;
            }
        };
        List<Integer> num = new ArrayList<>();

        num.add(30);
        num.add(81);
        num.add(75);
        num.add(14);

        //Collections.sort(num);
        //sort() method is used to short Collection Object/Values
        //by default sort() method have its own sorting logic 
        //if we want to write our own login we use Comparator Interface

        Collections.sort(num,com);
        System.out.print(num);
    }
}
