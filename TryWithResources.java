
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    
    public static void main(String[] args) throws IOException,NumberFormatException{
        int num = 0;
         BufferedReader bf = null;
        try{
        InputStreamReader in = new InputStreamReader(System.in);
        bf = new BufferedReader(in);
        num = Integer.parseInt(bf.readLine());
        }finally{
            bf.close();
            System.out.println("Fianlly Block");
        }//finally block minly use for close resources // here we BufferedReader Resource we have to close it
    }
}
