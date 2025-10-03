enum Status1 {
    STARTED,
    IN_PROGRESS,
    COMPLETED,
    FAILED
}

public class EnumIfElse {
    public static void main(String[] args) {
        Status1 currentStatus = Status1.STARTED;

        if(currentStatus == Status1.STARTED){
            System.out.println("The process has Started.");
        }else if(currentStatus == Status1.IN_PROGRESS){
            System.out.println("The Process is In Progress.");
        }else if(currentStatus == Status1.COMPLETED){
            System.out.println("The Process is Completed.");
        }else if(currentStatus == Status1.FAILED){
            System.out.println("The Process has Failed.");
        }else{
            System.out.println("Unknown Status.");
        }
    }
}
