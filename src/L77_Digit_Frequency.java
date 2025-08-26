import java.util.Scanner;
public class L77_Digit_Frequency {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        long  n=sc.nextInt();
        System.out.println("Enter the digit to count");
        int k=sc.nextInt();

        while(n>0){
            int rem=(int)n%10;
            if(rem==k){
                c++;
            }
            n=n/10;

        }
        System.out.println("The number is "+c+" times");
        
    }

}
