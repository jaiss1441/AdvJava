    abstract class Aa{
        abstract public void show(); //Abstract method
        abstract public void config(); //Abstract method
    }


    public class AbstractAnonymousClass {
    public static void main(String[] args) {
            Aa obj = new Aa(){
                public void show(){
                    System.out.println("Creating anonymous class and overriding show method");
                }
                public void config(){
                    System.out.println("Creating anonymous class and overriding config method");
                }
            };
            obj.show();
            obj.config();
    } 
    }
