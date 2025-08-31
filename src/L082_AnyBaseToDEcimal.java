import java.util.Scanner;
public class L082_AnyBaseToDEcimal {
    public static int  AnyBaseToDecimal(int digit ,int base) {
         int res=0;
       int i=0;
        while(digit>0){

            int rem=digit%10;
            res=res+rem*(int)Math.pow(base,i);
            i++;
            digit/=10;
        }
        return res;

        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number plaese ");
        int digit=sc.nextInt();
        System.out.println("Enter the base plaese ");
        int base=sc.nextInt();
       
        System.out.println(AnyBaseToDecimal(digit, base));



    }

}
