public class ExceptionExp2 {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int arr[] = new int[5];

        try {
            j = 18 / i;
            System.out.println("Array Out Of Bond" + arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmethic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" Array Index Out Of Bond Exception");
        }
    }
}
