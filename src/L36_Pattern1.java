import java.util.Scanner;
import java.util.regex.Pattern;
public class L36_Pattern1 {
    public int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public void Pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    public void Pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }

    }

    public void Pattern2o(int n){

        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }

    
    }

    public void Pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>=i+1;j--){
                System.out.print(" ");

            }
            for(int j=0;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public void Pattern3T(int n){
        int st=1;
        int sp=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print(" ");

            }
            for(int j=0;j<st;j++){
                System.out.print("*");

            }
            System.out.println();
            sp--;
            st++;
        }
    }

    public void Pattern4(int n){
        int st=n;
        int sp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("  ");

            }
            for(int j=0;j<st;j++){
                System.out.print(" *");

            }
            System.out.println();
            sp++;
            st--;
        }
    }
    public void Pattern5(int n){
        int st1=1;
        int sp1=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp1;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=st1;j++){
                System.out.print(" *");

            }

            if(i<=n/2){
                sp1--;
                st1+=2;

            }
            else{
                sp1++;
                st1-=2;
            }
            System.out.println();
             
        }
    }
    public void Pattern6(int n){
        int st1=n/2+1;
        int sp1=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=st1;j++){
                System.out.print(" *");
                
            }
            for(int j=1;j<=sp1;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=st1;j++){
                System.out.print(" *");
                
            }

            if(i<n/2+1){
                sp1+=2;
                st1--;

            }
            else{
                sp1-=2;
                st1++;
            }
            System.out.println();
             
        }
    }
     
    public void Pattern7(int n){
    int sp=0;
    int st=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                    System.out.print("  ");
                             
            }
            for(int j=0;j<st;j++){
                    System.out.print(" * ");
                             
            }
            System.out.println();
            sp++;
        }
    }
    public void Pattern7T(int n){
   
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    System.out.print(" * ");
                else
                System.out.print("  ");

                             
            }
             
            System.out.println();
         
        }
    }
    public void Pattern8(int n){
   
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i+j==n)
                    System.out.print(" * ");
                else
                System.out.print("  ");

                             
            }
             
            System.out.println();
         
        }
    }
    public void Pattern9(int n){
   
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i+j==n||i==j)
                    System.out.print(" * ");
                else
                System.out.print("  ");

                             
            }
             
            System.out.println();
         
        }
    }

    public void Pattern10(int n){
        int osp=n/2;
        int isp=-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=osp;j++){
                System.out.print("  ");
                
            }
            
                System.out.print(" * ");
 
            for(int j=1;j<=isp;j++){
                System.out.print("  ");
                
            }
            if(i>1&&i<n){
                System.out.print(" * ");
            }

            if(i<n/2+1){
                osp--;
                isp+=2;

            }
            else{
                osp++;
                isp-=2;
            }
            System.out.println();
             
        }
    }

    public void Pattern11(int n){
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;

            }
            System.out.println();
        }
    }
    public void Pattern12(int n){
        int k=0;
        int l=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int c=k+l;
                System.out.print(k+" ");

                k=l;
                l=c;

            }
            System.out.println();
        }
    }
    public void Pattern13(int n){
    int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                 k=fact(i)/(fact(j)*fact(i-j));

                 
                System.out.print(k+" ");

                 

            }
            System.out.println();
        }
    }

    public void Pattern14(int n){
        for(int i=1;i<=10;i++){
             
                System.out.printf("%d * %d = %d\n",n,i,n*i);

            }
           
        }
    
   public void Pattern15(int n){
        int st1=1;
        int sp1=n/2;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp1;j++){
                
                System.out.print("  ");
                 
                
            }
            int cval=k;
            for(int j=1;j<=st1;j++){
                
                System.out.print(cval+" ");
                if(j<=st1/2){
                    cval++;
                }
                else{
                    cval--;
                }
                                

            }

            if(i<=n/2){
                sp1--;
                st1+=2;

            }
            else{

                sp1++;
                st1-=2;
            }
            System.out.println();
            if(i<n/2+1){

                k++;
            }
            else {
                k--;
            }

             
        }
    }
    
   public void Pattern16(int n){
        int st1=1;
        int sp1=2*n-3;
        int k=1;
        for(int i=1;i<=n;i++){
            k=1;
             for(int j=1;j<=st1;j++){
                
                
                System.out.printf(" %d ",k);
                k++;
                // if(j<=st1/2){
                //     cval++;
                // }
                // else{
                //     cval--;
                // }
                                

            }
            for(int j=1;j<=sp1;j++){
                
                System.out.print("   ");
                 
                
            }
             for(int j=1;j<=st1;j++){
                if(i==n&&j==st1){
                    break;
                }
                
                k--;
                System.out.printf(" %d ",k);
                // if(j<=st1/2){
                //     cval++;
                // }
                // else{
                //     cval--;
                // }
                                

            }
             
           sp1-=2;
           st1++;

            // if(i<=n/2){
            //     sp1--;
            //     st1+=2;

            // }
            // else{

            //     sp1++;
            //     st1-=2;
            // }
            System.out.println();
            // if(i<n/2+1){

            //     k++;
            // }
            // else {
            //     k--;
            // }

             
        }
    }
    
     public void Pattern17(int n){
        int st1=1;
        int sp1=n/2;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp1;j++){
                if(i==n/2+1){
                    System.out.print(" * ");

                }
                else{

                    
                    System.out.print("   ");
                }
                 
                
            }
            
            for(int j=1;j<=st1;j++){
                
                System.out.print(" * ");
                 
                                

            }

            if(i<=n/2){
                // sp1--;
                st1++;

            }
            else{

                // sp1++;
                st1--;
            }
            System.out.println();
            if(i<n/2+1){

                k++;
            }
            else {
                k--;
            }

             
        }
    }
    
     public void Pattern18(int n){
        int st1=1;
        int sp1=n/2;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp1;j++){
                if(i==n/2+1){
                    System.out.print(" * ");

                }
                else{

                    
                    System.out.print("   ");
                }
                 
                
            }
            
            for(int j=1;j<=st1;j++){
                
                System.out.print(" * ");
                 
                                

            }

            if(i<=n/2){
                // sp1--;
                st1++;

            }
            else{

                // sp1++;
                st1--;
            }
            System.out.println();
            if(i<n/2+1){

                k++;
            }
            else {
                k--;
            }

             
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =sc.nextInt();
        L36_Pattern1 l=new L36_Pattern1();
        // l.Pattern1(n);
        // l.Pattern2(n);
        // l.Pattern2o(n);
        // l.Pattern3(n);
        // l.Pattern3T(n);
        // l.Pattern4(n);
        // l.Pattern5(n);
        // l.Pattern6(n);
        // l.Pattern7(n);
        // l.Pattern7T(n);
        // l.Pattern8(n);
        // l.Pattern9(n);
        // l.Pattern10(n);
        // l.Pattern11(n);
        // l.Pattern12(n);
        // l.Pattern13(n);
        // l.Pattern14(n);
        // l.Pattern15(n);
        // l.Pattern16(n);
        // l.Pattern17(n);
        l.Pattern18(n);


    }
}
