import java.util.Scanner;

public class sumEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        int rem,sum =0;
        while(num>0){
            rem = num % 10;
            if(rem%2==0) sum = sum+rem;
            num = num /10;
        }
        System.out.println("Sum of Even number Digits="+sum);
    }
}
