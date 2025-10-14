class Demo 
{
    public void show() throws ClassNotFoundException {
        Class.forName("Clac");
    }
}

public class ThrowsKeywordDucking{

    static{
            System.out.println("Class Loaded");
        }
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
             d.show();
        } catch (ClassNotFoundException e) {
        }
       
    }
}