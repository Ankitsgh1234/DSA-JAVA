import java.util.Scanner;
import java.util.Stack;

public class L107_BalanceBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exprassion ");
        String sb = sc.nextLine();

        Stack<Character> s = new Stack<>();
        for (char ch : sb.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);

            } else if (ch == ')') {
                if (s.peek() == '(') {
                    s.pop();
                } else {
                    System.out.println("Not balance");
                    return;
                }
            }
            
            else if (ch == ']') {
                if (s.peek() == '[') {
                    s.pop();
                } else {
                    System.out.println("Not balance");
                    return;
                }
            }
            
            else if (ch == '}') {
                if (s.peek() == '{') {
                    s.pop();
                } else {
                    System.out.println("Not balance");
                    return;
                }
            }
        }

        System.out.println("Balanced ");

        }
    }

