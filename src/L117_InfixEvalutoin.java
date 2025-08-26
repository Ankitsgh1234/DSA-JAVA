import java.util.Scanner;
import java.util.Stack;

public class L117_InfixEvalutoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String sb=sc.nextLine();

        Stack<Integer> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(char ch:sb.toCharArray()){
            if(ch=='('){
                st2.push(ch);

            }
            else if(ch==')'){
                while(st2.peek()!='('){
                
                    int v2=st1.pop();
                    // st1.pop();
                    int v1=st1.pop();
                    // st1.pop();
                    st1.push(operation(v1,v2,st2.peek()));
                    st2.pop();
                }
                st2.pop();
                
            }
            else if(ch=='-'||ch=='+'||ch=='*'||ch=='/'){
                // if(precedency(ch)>precedency(st2.peek())){
                //     st2.push(ch);
                // }
                // else{

                //     int v2=st1.peek();
                //     st1.pop();
                //     int v1=st1.peek();
                //     st1.pop();
                //     st1.push(operation(v1,v2,ch));
                //     st2.pop();
                // }
                while(st2.size()>0&&st2.peek()!='('&&precedency(ch)<=precedency(st2.peek())){
                    int v2=st1.peek();
                    st1.pop();
                    int v1=st1.peek();
                    st1.pop();
                    st1.push(operation(v1,v2,ch));
                    st2.pop();
                }
                st2.push(ch);

            }
            else if(Character.isDigit(ch)){
                st1.push(ch-'0');

            }

        }
        while(st2.size()>0){
                
                    int v2=st1.peek();
                    st1.pop();
                    int v1=st1.peek();
                    st1.pop();
                    st1.push(operation(v1,v2,st2.peek()));
                    st2.pop();
                }

        System.out.println(st1.peek());
        
    }
    public static int precedency(char ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }
        else if(ch=='*'||ch=='/'){
            return 2;
        }
        else return -1;
    }
    public static int operation(int v1,int v2,char ch)
    {
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
