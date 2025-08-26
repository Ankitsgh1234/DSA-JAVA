import java.util.Scanner;
import java.util.Stack;

public class L126_CelebrityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();        
        int m=sc.nextInt();        

        int[][] arr=new int[n][m];

        System.out.println("Please Enter the value in array");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            st.push(i);

        }
        while(st.size()>=2){
            int i=st.pop();
            int j=st.pop();
            if(arr[i][j]==1){
                st.push(j);
            }
            else{
                st.push(i);
            }

        }
        int pot=st.pop();
        for(int i=0;i<n;i++){
            // if(arr[pot][i]==1){
            //     continue;
            // }
            // else{
            //     System.out.println("There is no celebrity");
            //     return;
            // }

            if(i!=pot){
                if(arr[i][pot]==0||arr[pot][i]==1){
                    System.out.println("None");
                    return;
                }
            }

        }
        System.out.println(pot+" is the celebrity");

        
    }

}
