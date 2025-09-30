class A{
    public void show(){
        System.out.println("In Show method of class A");
    }
}



public class AnonymousClass {
    public static void main(String[] args) {

        A obj = new A(){
            public void show(){ //Overriding show method of class A
                System.out.println("In Show method of Anonymous class");
            }
        }; //Creating object of anonymous class
        obj.show(); //Calling show method of anonymous class
}
}
//Anonymous class is a class without a name
