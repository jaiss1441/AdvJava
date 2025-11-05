import java.lang.classfile.ClassFile.Option;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "harlie", "David", "Eve");    
        Optional<String> firstNameStartingWithC = names.stream()
                                                    .filter(name -> name.startsWith("C"))
                                                    .findFirst();
        System.out.println(firstNameStartingWithC.orElse("Not Found"));
        
       String con = names.stream()
                            .filter(name -> name.contains("i"))
                            .findFirst()
                            .orElse("Not found");
        System.out.println(con);
}
}