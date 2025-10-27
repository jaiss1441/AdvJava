import java.util.Set;
import java.util.TreeSet;

public class SetWithTreeSet {
    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>();

        s1.add(22);
        s1.add(33);
        s1.add(44);
        s1.add(55);

        for(int n : s1){
            System.out.println(n);
        }
    }
}
