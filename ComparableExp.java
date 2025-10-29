import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Integer>{

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
   
    public int compareTo(Integer o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    
}

public class ComparableExp {
    public static void main(String[] args) {
       
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                return 1;
                else
                return -1;
            }
        };
       

        List<Integer> stud = new ArrayList<>();

        stud.add(78);
        stud.add(54);
        stud.add(98);
        stud.add(56);

        Collections.sort(stud, com);
        System.out.println(stud);
    }
}
