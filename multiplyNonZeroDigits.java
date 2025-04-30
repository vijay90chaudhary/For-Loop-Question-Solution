import java.util.Scanner;

public class multiplyNonZeroDigits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number =");
        int num = sc.nextInt();
        int mul =1, rem;
        while(num > 0){
            rem = num % 10;
            if(rem != 0){
                mul = mul * rem;
            }
            num = num / 10;
            
        }
        System.out.println("Multiply of non zero Digits ="+mul);
    }
}
