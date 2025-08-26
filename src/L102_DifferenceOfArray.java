import java.util.Scanner;

public class L102_DifferenceOfArray {
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
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            System.out.print("Enter the "+i+" term ");
            arr2[i]=sc.nextInt();
        }

        int[] diff=new int[m];
        int c=0;
        int i=n-1;
        int j=m-1;
        int k=m-1;
        while(k>=0){
            int arv=i>=0?arr1[i]:0;
            if(arr2[j]+c>=arv){
                diff[k]=arr2[j]+c-arv;

            }
            else{
                diff[k]=arr2[j]+c+10-arv;
                if(j>=0)
                arr2[j-1]--;

            }
            i--;
            k--;
            j--;
        }
        int ind=0;
        while(ind<=m){
            if(diff[ind]==0){
                ind++;

            }
            else{
                break;
            }
        }

         for(int ch=ind;ch<m;ch++){
            System.out.println(diff[ch]);

         }

    }

}
