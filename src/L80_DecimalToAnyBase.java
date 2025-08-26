import java.util.Scanner;
public class L80_DecimalToAnyBase {
    public static int DecimalToAnyBase(int digit,int base){
        int res=0;
        int i=0;

        while(digit>0){
            int rem=digit%base;
            res=res+rem*(int)Math.pow(10,i);
            i++;
            digit=digit/base;


        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the digit ");
        int num=sc.nextInt();
        System.out.println("Enter the base you want ");
        int b=sc.nextInt();
       System.out.println( DecimalToAnyBase(num,b));
       
        // System.out.println("The output is "+base);
        
        
    }

}
