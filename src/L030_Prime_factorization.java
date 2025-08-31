import java.util.Scanner;
public class L030_Prime_factorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number pleae");
        n=sc.nextInt();
        
        while(n!=0){
            // int i=0;
            // System.out.println(i);
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                    n=n/i;
                    break;
                }
            }
            
        }

    }

}
