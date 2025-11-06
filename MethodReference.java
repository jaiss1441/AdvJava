import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        List<String> upperCaseNames = names.stream()
                                          .map(name -> name.toUpperCase())//lambda expression
                                          //with help of toUpperCase method we convert into upper case
                                          .toList();
        System.out.println(upperCaseNames);
        //using method reference
        List<String> upperCaseNamesMethodRef = names.stream()
                                                    .map(String::toUpperCase)
                                                    .toList();
        upperCaseNamesMethodRef.forEach(System.out::println);
        //method reference is more concise and readable
        //it refers to existing method by name
        //it can be used with static methods, instance methods, and constructors
        //syntax: ClassName::methodName
        //example of static method reference
        List<Integer> nameLengths = names.stream()
                                         .map(String::length)
                                         .toList();
        System.out.println(nameLengths);

        

    }
}
