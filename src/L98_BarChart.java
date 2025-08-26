import java.util.Scanner;
public class L98_BarChart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enterr the number of termas");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+" term ");
            arr[i]=sc.nextInt();
        }
         int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int floor=max;floor>0;floor--){
            for(int i=0;i<n;i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }


            }
            System.out.println();
        }




    }

}
