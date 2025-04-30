
import java.util.Scanner;

public class basics{
    public static void main(String[] args) {
        // for (int i =0;i<10; i++){
        //     System.out.println("Hello World");
        // }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of times loop run =");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Hello");
        }
    }
}