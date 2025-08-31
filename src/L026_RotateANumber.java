import java.util.Scanner;
// import java.lang.pow;

public class L026_RotateANumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Entetr the number please");
        n=sc.nextInt();
        int k;
        System.out.println("Enter the k");
        k=sc.nextInt();
        int temp=n;
        int temp1=n;
        int i=0;
        while(temp!=0)
        {
            temp=temp/10;
            i++;
        }
        int rem=n%(int)Math.pow(10, k);
        n=n/(int)Math.pow(10, k);
        int ans=n+rem*(int)Math.pow(10, i-k);
        System.out.println("The k time rotation of "+temp1+" is "+ans);

        
    }
}
