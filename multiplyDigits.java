import java.util.Scanner;

public class multiplyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number =");
        int num = sc.nextInt();
        int multiply =1, rem;
        while(num > 0){
            rem = num % 10;
            num = num / 10;
            multiply = multiply * rem;
            
        }
        System.out.println("multiply of Digits ="+multiply);
    }
}
