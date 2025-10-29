import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
   
    public int compareTo(Student that) {
        if(this.id > that.id)
        return 1;
        else
        return -1;
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
       
        Comparator<Student> com = new Comparator<Student>(){
            public int compare(Student i, Student j){
                if(i.id > j.id)
                return 1;
                else
                return -1;
            }
        };
       

        List<Student> stud = new ArrayList<>();

        stud.add(new Student(4,"Vikas"));
        stud.add(new Student(3, "Chetan"));
        stud.add(new Student(2, "Saurabh"));
        stud.add(new Student(1, "Nilesh"));

        Collections.sort(stud);
        for(Student s : stud){
        System.out.println(s);
        }
    }
}
