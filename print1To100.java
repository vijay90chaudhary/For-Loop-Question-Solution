
import java.util.Scanner;

public class print1To100 {
    public static void main(String[] args) {
        // for(int i = 1; i<=100;i++){
        //     System.out.println(i);
        // }
        // for(int i = 73; i<=829;i++){
        //     System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n =sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
}
