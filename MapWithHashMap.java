import java.util.HashMap;
import java.util.Map;

public class MapWithHashMap {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();

        students.put("Vikas", 54);
        students.put("Saurabh", 65);
        students.put("Nilesh", 75);

        System.out.println(students);

    }
}
