import java.util.Scanner;
import java.util.*;
public class L130_SmallestNumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String sb = sc.nextLine();

        Stack<Integer> st =new Stack<>();
        int k=1;
        for(char ch:sb.toCharArray()){
            if(ch=='d'){
                    st.push(k);
                    k++;
                
            }
            else{
                st.push(k);
                    k++;

                while(st.size()>0){
                    System.out.println(st.pop());
                }

            }

        }
        st.push(k);
        while(st.size()>0){
                    System.out.println(st.pop());
    }

}
}