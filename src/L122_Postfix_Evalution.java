import java.util.Scanner;
import java.util.Stack;

public class L122_Postfix_Evalution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Expression :- ");
        String sb = sc.nextLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for(char ch:sb.toCharArray()){
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
               int v2=vs.pop();
               int v1=vs.pop();
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
