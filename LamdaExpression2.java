interface  Lam{
    void show(int i);
}


public class LamdaExpression2 {
    public static void main(String[] args) {
        Lam obj = (i) -> {
         
                System.out.println("In annonimuse class : "+ i);
           
        };

        obj.show(5);
    }
}
