abstract class Car{

    //Abstract method must be in abstract class
    //Abstract class can have abstract method and non-abstract method
    //Abstract class cannot be instantiated
    //Car myCar = new Car(); // This will give error as we cannot create object of an abstract class

    //public void drive(); // This will give error as we cannot have abstract method in a non-abstract class
    //Method without body is called abstract method
    
    abstract public void drive();

    public void playMusic(){
        System.out.println("Playing music");
    }
    
}

class InnerAbstractKey extends Car   { //Concrete class 

    //We can create object of concrete class
    //Car myCar = new InnerAbstractKey(); 
    // And we can call the abstract method of abstract class using the object of concrete class
    //myCar.drive();
    
    // This class must implement the abstract method of the abstract class
    public void drive(){
        System.out.println("Driving car");
    }

}



public class AbstractKey {
    public static void main(String[] args) {
        Car myCar = new InnerAbstractKey();
        myCar.playMusic();
        myCar.drive();
    }

}