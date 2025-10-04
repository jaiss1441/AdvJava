enum Laptop5{
    DELL(300000),HP(250000),APPLE,ASUS(700000);
    private int price;

    private Laptop5()
    {
        price = 400000;
    }
    private Laptop5(int price){
        this.price = price;
        System.out.println("In Laptop :" + this.name());
    }
    public int getPrice(){
        return this.price;
    }

}

public class EnumClassExp {
    public static void main(String[] args) {
            //Laptop5 myLaptop = Laptop5.DELL;
           // System.out.println("My Laptop is: " + myLaptop);

           for(Laptop5 Lap : Laptop5.values())
           {
            System.out.println(Lap + ": " + Lap.getPrice());
           }
    }
    
}
