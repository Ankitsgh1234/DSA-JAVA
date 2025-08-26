import java.util.Scanner;
import java.util.Stack;

public class L113_Largest_Histogram {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] nrr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        Stack<Integer> st=new Stack<>();
        int[] rb= new int[n];
        st.push(arr.length-1);
        rb[arr.length-1]=arr.length ;
        for(int i=1;i<n;i++){

        }


        int[] lb= new int[n];




        int max=0;
        
        for(int i=0;i<n;i++){
            int width=rb[i]-lb[i]-1;
            int area=width*arr[i];
            if(area>max){
                max=area;
            }

               }
               System.out.println(max);


}
}
