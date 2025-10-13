public class ThrowKeyword {
    public static void main(String[] args) {
        
    
    int i = 20;
    int j = 0;
    try{
        j = 18 / i;
        if(j == 0)
        throw new ArithmeticException("I don't Want print Zero");

    }catch(ArithmeticException e){
        j = 18 / 1;
        System.out.println("This is defult output..." + e);
    }
    System.out.println(j);

    System.out.println("Bye");
}
}
