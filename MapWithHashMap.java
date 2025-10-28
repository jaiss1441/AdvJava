import java.util.HashMap;
import java.util.Map;

public class MapWithHashMap {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        //Itis collection of Key and value pair data
        // in Map we can add Element with same key, Key must be diffrent value can be same
        //HashMap good for Asyncrones task
        //HashTable id good for Syncrones task like In Multithreading where syncronise Threads

        students.put("Vikas", 54);
        students.put("Saurabh", 65);
        students.put("Nilesh", 75);

        System.out.println(students + "  ");

        for(String key : students.keySet()){
            System.out.println(key );//getting Key using keySet() method
        }

        for(int values : students.values()){
            System.out.println(values );//getting vales using values() method
        }

    }
}
