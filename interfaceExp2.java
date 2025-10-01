class Computer{

    public void coding(){
    }
}

class Desktop extends Computer{
    public void coding(){
        System.out.println("Coding in desktop");
    }
}   


class Laptope extends Computer{
    public void coding(){
        System.out.println("Coding in Laptop");
    }
}



class Devloper{
    public void develop(Computer c){
        c.coding();
    }
}

public class interfaceExp2 {
    public static void main(String[] args) {

        Computer lap = new Laptope();
        Computer desk = new Desktop();

        Devloper d = new Devloper();
        d.develop(desk);
        
    }
}
