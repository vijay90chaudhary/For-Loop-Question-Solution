import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num =sc.nextInt();

        // factor 
        // for(int i = 1; i<=num ; i++){
        //     if (num % i == 0){
        //         System.out.print(i+" ");
        //     }
        // }

        // highest factor
        int hf = 1;
        // for (int i = 1; i < num; i++) {
        //     if(num % i ==0){
        //         hf = i;
        //     }
        // }

        for (int i = num - 1; i >= 1; i--) {
            if(num % i == 0){
                hf = i;
                break;
            }
            
        }
        System.out.println("Highest factor = "+hf);
    }
}
