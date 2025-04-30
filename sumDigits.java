import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number =");
        int num = sc.nextInt();
        int sum =0, rem;
        while(num > 0){
            rem = num % 10;
            num = num / 10;
            sum = sum +rem;
            
        }
        System.out.println("Sum of Digits ="+sum);
    }
}

