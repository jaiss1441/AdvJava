public class ExceptionExp1 {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;
        try{
        j = i/0;
        }catch(Exception e){
            System.out.println("Divide by Zero not Valid");
        }
        System.out.println(j);
    }
}
//types of Exception 
//i) Compile Time Erorr
    //It will ocure when Compiler find Syntax Error
//ii) Logical Error
    //It will ocure when you done logical Mistakes in Code
//iii) Runtime Error
    //It is Error Which is ocure at run time after code compiled 
    //In Exception handling we try handle Runtime Errors with help of try catch in java