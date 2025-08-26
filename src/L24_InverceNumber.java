import java.util.Scanner;
public class L24_InverceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number please");
        n=sc.nextInt();
        int num=n;

        int i=1;
        double inv=0;
        double rem=0;
        while(n>0){
            rem=n%10;
            inv=inv+(i*Math.pow(10,rem-1));
            n=n/10;
            i++;

        }
        inv=(int)inv;
        System.out.println("the inverce of "+num+" is "+inv);

    }


}
