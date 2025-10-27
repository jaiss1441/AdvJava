
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class SetWithIterator{
    public static void main(String[] args) {

        Collection<Integer> co = new TreeSet<Integer>(); 
        
        co.add(33);
        co.add(44);
        co.add(66);
        co.add(88);

        
        Iterator<Integer> vales = co.iterator();

        while(vales.hasNext())
            System.out.println(vales.next());
    }
}