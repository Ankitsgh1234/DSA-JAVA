import java.util.Scanner;
public class L28_GDC_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Enter the first number");
        n1=sc.nextInt();
        int n2;
        System.out.println("ENter the second number ");
        n2=sc.nextInt();
        int on1=n1;
        int on2=n2;

        while(n1%n2!=0){
            int rem=n1%n2;
            n2=n1;
            n1=rem;
        }

        int gcd=n1;

        int lcm=(on1*on2)/gcd;
        System.out.println("The gdc is "+gcd+" and lcm is "+lcm);





    }

}
