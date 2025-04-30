import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number=");
        int n = sc.nextInt();
        boolean flag = false; // false means Prime 
        
        for(int i =2; i<=n-1;i++){
            if(n%i == 0){
                flag = true;
                break;
            }
        }
        if(n==1){
            System.out.println("Neither prime Nor composite number");
        }
        else if(flag == false){
            System.out.println(n+" is Prime number");
        }else{
            System.out.println(n+" is composite number");
        }
    }
}
