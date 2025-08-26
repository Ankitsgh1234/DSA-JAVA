import java.util.Scanner;

public class L86_AnyhBaseAddition {

    public static int anybaseSum1(int n1, int n2, int b) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || b > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            rv = rv + d * p;
            p = p * 10;
        }

        return rv;
    }


    public static int anybaseSum(int n1, int n2, int b) {
    int rv = 0;
    int c = 0;
    int p = 1;
    
    while (n1 > 0 || n2 > 0 || c > 0) {
        int d1 = n1 % 10;
        int d2 = n2 % 10;
        n1 /= 10;
        n2 /= 10;

        int d = d1 + d2 + c;
        c = d / b;
        d = d % b;

        rv = rv + d * p;
        p = p * 10;
    }

    return rv;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number please");
        int d1 = sc.nextInt();
        System.out.println("Entre the second number please");
        int d2 = sc.nextInt();

        System.out.println("Enter the base ");
        int base = sc.nextInt();
        // int sum=0;

        // while(d1>0||d2>0){
        // int rem=(d1%10)+(d2%10);
        // if(rem>base){
        // // if(rem%10==0){
        // // sum+=10;
        // // }
        // sum=sum +(rem%base);
        // d1/=10;
        // d2/=10;
        // d1+=1;
        // System.out.println("jewekjdsn");
        // sum*=10;
        // }
        // else {
        // sum=sum*10+rem;
        // d1/=10;
        // d2/=10;

        // }
        // rem=0;

        // }
        // System.out.println("The answer is "+sum);
        System.out.println(anybaseSum(d1, d2, base));
    }

}
