//there is 3 types of inter face
    //i) Nomal interface -> In this we have minimum 2 abstract method 
    //ii) FunctionalInterface Inteerface/SAM ( Single abstract method) -> in this we have only 1 method also
    //   @FunctionalInterface annotation
    //iii) Marker Interface -> this is a blank interface which is used by or help to compiler it is used in serialization

@FunctionalInterface
interface A5{
    void show();
    //void display(); if try to add more then one method it will give you error becouse of annotation 
    //
}

public class InterfaceTypes {
    public static void main(String[] args) {
        A5 obj = new A5() {
            public void show(){
                System.out.println("In Show ");
            }
        };
        obj.show();
        //implemention show method in annomious class
    }
    
}
