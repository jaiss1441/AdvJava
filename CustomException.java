class VikasException extends Exception{
    public VikasException(String str){
        super(str);
    }
}


public class CustomException {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        try {
            j = 18 / i;
            throw new VikasException("I don't want to print Zero");
        } catch (VikasException e) {
            j = 18 / 1;
            System.out.println("This is defult Output");
        }catch(Exception e){
            System.out.println("Any Exception could be handled here");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
