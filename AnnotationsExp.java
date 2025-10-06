class A4{

    public void ThisIsExampleOfAnnotation(){
        System.out.println("In Class A");
    }
}
    //here it shoud show class B4 method but it showing Class A4 method becouse of method wad diffrent
    //If we add (@override) annotation here it will show error and then we can fix it 
    
// class B4 extends A4{
//     @Override
//     public void ThisIsExampleOfAnnotations(){ // here extra "s" is added into method if we add @Ocerride annotation 
//         System.out.println("In Class B");    // it will show error which can help you to catch bug/error
//     }
// }

// Annottion nothing but meta information to compiler to understand what we wanna do 
class B4 extends A4{
    @Override
    public void ThisIsExampleOfAnnotation(){
        System.out.println("In Class B");
    }
}

public class AnnotationsExp{
    public static void main (String[] args){
        B4 obj = new B4();
        obj.ThisIsExampleOfAnnotation();
    }
}