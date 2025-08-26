import java.util.Scanner;
import java.util.Stack;

public class L111_Stock_Span {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] nrr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        Stack<Integer> st=new Stack<>();
        st.push(0);
        nrr[0]=1;
        for(int i=1;i<n;i++){
            while(st.size()>0&&arr[i]>arr[st.peek()]){
                st.pop();

            }
            if(st.size()==0){
                nrr[i]=i+1;
            }
            else{
                nrr[i]=i-st.peek();
            }
            st.push(i);

        }
        for(int i=0;i<n;i++){
            System.out.println(nrr[i]);

        }



    }

}
