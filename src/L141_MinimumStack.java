import java.util.Scanner;
import java.util.Stack;

public class L141_MinimumStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of terms");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        Stack<Integer> min=new Stack<>();
        min.push(arr[0]);

        for(int i:arr){
            
            st.push(i);
            if(i<min.peek()){
                min.push(i);
            }


        }
        System.out.println("Minimum is "+min.peek());


    }

}
