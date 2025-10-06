@FunctionalInterface
interface A6{
    void show();
}


public class LamdaExpression {
    public static void main(String[] args) {
       A6 obj = () ->{
        System.out.println("in show");
       };

       obj.show();
    }
}
