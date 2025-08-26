import java.util.Scanner;
import java.util.Stack;

public class L119_InfixConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Expression :- ");
        String sb = sc.nextLine();

        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> ope = new Stack<>();

        for (char ch : sb.toCharArray()) {
            if (ch == ' ') continue; // ignore spaces

            if (ch == '(') {
                ope.push(ch);
            } 
            else if (Character.isLetterOrDigit(ch)) {
                pre.push(ch + "");
                post.push(ch + "");
            } 
            else if (ch == ')') {
                while (!ope.isEmpty() && ope.peek() != '(') {
                    process(pre, post, ope);
                }
                if (!ope.isEmpty()) ope.pop(); // remove '('
            } 
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!ope.isEmpty() && ope.peek() != '(' && precedency(ch) <= precedency(ope.peek())) {
                    process(pre, post, ope);
                }
                ope.push(ch); // ✅ push only operators
            }
        }

        while (!ope.isEmpty()) {
            process(pre, post, ope);
        }

        System.out.println("Prefix  : " + pre.peek());
        System.out.println("Postfix : " + post.peek());
    }

    // combine two operands with an operator
    public static void process(Stack<String> pre, Stack<String> post, Stack<Character> ope) {
        char op = ope.pop();

        String v2 = post.pop();
        String v1 = post.pop();
        post.push(v1 + v2 + op);

        String p2 = pre.pop();
        String p1 = pre.pop();
        pre.push(op + p1 + p2);
    }

    public static int precedency(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        return -1;
    }
}
