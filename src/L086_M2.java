import java.util.Scanner;

public class L086_M2 {
    public static void main(String[] args) {
        L082_AnyBaseToDEcimal AD=new L082_AnyBaseToDEcimal();
        L080_DecimalToAnyBase DA=new L080_DecimalToAnyBase();

         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number please");
        int d1=sc.nextInt();
        System.out.println("Entre the second number please");
        int d2=sc.nextInt();

        System.out.println("Enter the base ");
        int base=sc.nextInt();
        if(base!=10){
            d1=AD.AnyBaseToDecimal(d1, base);
            d2=AD.AnyBaseToDecimal(d2, base);
        }
        int sum=d1+d2;
        if(base!=10){
          sum=  DA.DecimalToAnyBase(sum, base);
        }
        System.out.println("The ans is " + sum);

    }

}
