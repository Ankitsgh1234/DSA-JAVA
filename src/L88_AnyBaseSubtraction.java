import java.util.Scanner;

public class L88_AnyBaseSubtraction {
    public static int subtraction(int n1,int n2,int b)
    {
        int rv=0;
        int c=0;
        int p=1;
        while(n2>0){
            int d1=n1%10;
            n1/=10;
            int d2=n2%10;
            n2/=10;
            int d=0;
            d2=d2+c;
            if(d2>=d1){
                c=0;
                d=d2-d1;
            }
                else{
                    c=-1;
                    d=d2+b-d1;
                }
                rv+=d*p;
                p*=10;
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
        System.out.println(subtraction(d1, d2, base));

    }

}
