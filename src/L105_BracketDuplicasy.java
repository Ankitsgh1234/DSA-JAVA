import java.util.*;

public class L105_BracketDuplicasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exprassion ");
        String sb = sc.nextLine();

        Stack<Character> s = new Stack<>();
        for (char ch : sb.toCharArray()) {
            if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                if (s.peek() == '(') {
                    System.out.println("We have the duplicasy");
                    return;
                } 
                else {
                    while (s.peek() != '(') {
                        s.pop();
                    }
                    s.pop();
                }
            } else {
                s.push(ch);
            }

        }
        System.out.println("We dont have the duplicasy");

    }

}
