import java.util.ArrayList;
import java.util.List;

class Students{
    private String name;
    private int age;


    
    public Students() {
    }



    public Students(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "students [name=" + name + ", age=" + age + "]";
    }

    
    
}

public class ConstructorReference {
    public static void main(String[] args) {

        List <String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        List<Students> studentList = new ArrayList<>();

        // for(String name : names){
        //     //using lambda expression
        //     //Students student = new Students(name);
        //     //studentList.add(student);
        //     studentList.add(new Students(name));
        // }
        // System.out.println(studentList);

        //using stream and lambda expression
        //  studentList = names.stream()
        //         .map(name -> new Students(name))
        //         .toList();
        //         System.out.println(studentList);

        studentList = names.stream()
                .map(Students::new)
                .toList();
        System.out.println(studentList);
        //constructor reference is used to refer to a constructor without creating an instance
    }
}
