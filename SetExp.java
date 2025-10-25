import java.util.HashSet;
import java.util.Set;

public class SetExp {
    public static void main(String[] args) {
        Set<Integer> se = new HashSet<>();
        //In Set we can not store Duplicate values
        //Result show in unshorted Order
        //It store unique values
        se.add(22);
        se.add(33);
        se.add(44);
        se.add(55);

        for(int n : se){
            System.out.println(n);
        }
    }
}
