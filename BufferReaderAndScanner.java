
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderAndScanner {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        // In Older version we BufferReader to take input and it is complex 
        //in leter version of java Scanner Class intruduced


        // System.out.println("Enter a Number");
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // //Every Time you use source must to be closed 
        //  bf.close();

        Scanner sc = new Scanner(System.in);

        System.out.println("Second Numver ");
        int num2 = sc.nextInt();
        System.out.println(num2);
       
        sc.close();

    }
}
