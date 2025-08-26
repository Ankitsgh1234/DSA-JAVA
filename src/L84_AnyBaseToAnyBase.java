import java.util.Scanner;

public class L84_AnyBaseToAnyBase {
    public static int AnyBaseToAnyBase(int n,int b1,int b2){
        L82_AnyBaseToDEcimal AD=new L82_AnyBaseToDEcimal();
        L80_DecimalToAnyBase DA=new L80_DecimalToAnyBase();
        int  num=AD.AnyBaseToDecimal(n, b1);
        int newNum=DA.DecimalToAnyBase(num, b2);
        return newNum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        int digit=sc.nextInt();
        System.out.println("Enter the base of given digit");
        int base =sc.nextInt();
        System.out.println("Enter the base in which you wnat to convert");
        int nbase=sc.nextInt();
        System.out.println(AnyBaseToAnyBase(digit, base, nbase));
 

}
}