
   enum Status{
    Pending,
    InProgress,
    Completed,
    Failed
}
//Enum in Java is a special data type that enables for a variable to be a set of predefined constants.
//The variable must be equal to one of the values that have been predefined for it.
//Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.
//Because they are constants, the names of an enum type's fields are in uppercase letters.
//Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command line flags, etc.
//To define an enum, use the enum keyword (instead of class or interface), and separate the constants with commas.
//An enum can have constructors, methods, and variables.
//The enum constructor is called only once, when the enum is created.
//Enums can be used in switch statements to execute different code based on the enum value.
//By default, enums have some built-in methods such as values(), ordinal(), valueOf(), etc.
//Enums can implement interfaces but cannot extend classes because they implicitly extend the java.lang.Enum class.
public class EnumExp {
    public static void main(String[] args) {
        
        Status s = Status.InProgress;
        System.out.println(s);

        for(Status st : Status.values()){
            System.out.println(st + " at index " + st.ordinal());
        }
    }
}
//Output    
//InProgress
//Pending at index 0
//InProgress at index 1
//Completed at index 2      
//Failed at index 3
//The enum constants are static and final implicitly, so we cannot change their values.

