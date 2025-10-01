interface A2{

    int age = 30; // by default final and static
    String name = "John"; // by default final and static

    //In terface methods are by default abstract and public
    void show();
    void config();
}
class B2 implements A2{
    //we can implement multiple interfaces
    //class B2 implements A2, C2{
    //we can also extend a class and implement an interface
    //class B2 extends D2 implements A2{
    //we can also implement an interface in an abstract class
    // class to class  extends
    //class to interface implements
    //interface to interface extends
    //abstract class B2 implements A2{
    public void show(){
        System.out.println("In show method of class B2");
    }
    public void config(){
        System.out.println("In config method of class B2");
    }
}   



public class interfaceExp {
    public static void main(String[] args) {
        A2 obj = new B2();
        obj.show();
        obj.config();
    }
}
