import java.util.Scanner;

public class reverseAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        System.out.println("The number is "+num);
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println("Reverse number is "+rev);
        System.out.println("Number + Reverse is "+(num+rev));
    }
}
