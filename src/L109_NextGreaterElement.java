import java.util.Scanner;
import java.util.Stack;

public class L109_NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the term "+i);
            arr[i]=sc.nextInt();
        }
        
        Stack<Integer> s = new Stack<>();

        s.push(arr[n-1]);
        arr[n-1]=-1;
        for(int i=n-2;i>=0;i--){
             while(s.size()>0&&arr[i]>=s.peek())
             {
                s.pop();
             }
             if(s.size()==0){
                arr[i]=-1;
             }
             else{
                arr[i]=s.peek();
             }
             s.push(arr[i]);
        }

        System.out.println("The answer is ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
