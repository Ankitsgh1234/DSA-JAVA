import java.util.Scanner;
import java.util.Stack;

public class L124_PostfixEvalution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Expression :- ");
        String sb = sc.nextLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for(int i=sb.length()-1;i>=0;i--){
            char ch=sb.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int v1=vs.pop();
                int v2=vs.pop();
               vs.push(operation(v1,v2,ch));



            }
            else {
                vs.push(ch-'0');
                ps.push(ch+"");
                is.push(ch+"");
            }

        }
        System.out.println(vs.pop());

    }
    public static int operation(int v1,int v2,char ch){

         if(ch=='+' ){
            return v1+v2;
        }
        else if(ch=='-' ){
            return v1-v2;
        }
        else if(ch=='*' ){
            return v1*v2;
        }
        else
        return v1/v2;
    }
}
