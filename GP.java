import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms =");
        int n = sc.nextInt();

        // 1 2 4 8 16 ...
        // int a = 1, r = 2;
        // for(int i = 1; i<=n;  i++){
        //     System.out.print(a+" ");
        //     a *= r;
        // }

        // 3 12 48 192 .....
        int  a = 3, r = 4;
        for (int i = 1; i <= n; i++){
            System.out.print(a+" ");
            a *= r;
        }
            
    }
}
