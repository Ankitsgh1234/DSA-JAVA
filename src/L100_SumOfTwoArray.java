import java.util.Scanner;

public class L100_SumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enterr the number of terms in first array");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+" term ");
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enterr the number of terms in second array");
        int m=sc.nextInt();
        int[] arr2=new int[n];
        for(int i=0;i<m;i++){
            System.out.print("Enter the "+i+" term ");
            arr2[i]=sc.nextInt();
        }
        int c=0;
        int i=n-1;
        int j=m-1;
        int max=Math.max(m,n);
        int[] arr3=new int[max+1];
        // max--;
 int digit=0;
        while(max>=0){

             digit+=c;
            if(i>=0){
                digit+=arr1[i];

            }
            if(j>=0){
                digit+=arr2[j];

            }
            int d1=digit%10;
            c=digit/10;
            arr3[max]=d1;
            d1=0;
            digit=0;
            i--;
            j--;
            max--;



        }
        for(int it:arr3){
            System.out.print(it+" " );
        }
    }

}
