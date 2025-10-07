@FunctionalInterface
interface Lam2{
    int add(int i, int j);
}

public class LamdaWithReturn {
    public static void main(String[] args) {
        // Lam2 obj = new Lam2()
        //  {
        //     public int add( int i, int j){
        //         System.out.println("In Lamda ");
        //         return i+j;
        //     }
        // };              //Annonimous class with return type

        // int result = obj.add(5, 4);
        // System.out.println(result);

        Lam2 obj = (int i, int j) -> i + j; // with lamda reduced version // no need to mention return keyword

        int result = obj.add(5, 4);
        System.out.println(result);
    }
}
