class A{
    int n;

    public void show(){
        System.out.println("In Show method of class A");
    }

    class B{//Inner class

        public void display(){
            System.out.println("In display method of class B");
        }

    }

    static class C{//Static Inner class

        public void print(){
            System.out.println("In print method of  Static class C");
        }

    }
}




public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        //To create object of inner class we need to create object of outer class first
        //Then using that object we can create object of inner class
        A.B obj2 = obj.new B(); //Creating object of inner class
        obj2.display();

        A.C obj3 = new A.C(); //Creating object of static inner class
        obj3.print();

        //if class is static we can create object without creating object of outer class
    }
}
