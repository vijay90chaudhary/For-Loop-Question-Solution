
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number=");
        int n = sc.nextInt();

        // for(int i = 1 ; i <= 2*n-1; i=i+2){
        //     System.out.print(i+" ");
        // }

        // AP 4,7,10,13,...
        for(int i = 4 ; i <= 3*n+1; i=i+3){
                 System.out.print(i+" ");
             }
    }
}
