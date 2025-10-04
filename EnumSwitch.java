enum Status2{
    STARTED,
    IN_PROGRESS,
    COMPLETED,
    FAILED
}

public class EnumSwitch {
    public static void main(String[] args) {
        Status2 currentStatus2 = Status2.STARTED;

        switch (currentStatus2){
          case STARTED:
                System.out.println("The process has Started.");
                break;
            case IN_PROGRESS:
                System.out.println("The Process is In Progress");
                break;
            case COMPLETED:
                System.out.println("The Process is Completed.");
                break;  
            case FAILED:
                System.out.println("The Process has Failed.");
                break;      
            default:
                System.out.println("Unknown Status.");
                break;
        }
    }
}