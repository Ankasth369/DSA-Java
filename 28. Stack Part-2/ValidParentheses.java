import java.util.Stack;

public class ValidParentheses {

    public static boolean isValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //opening bracket
            if (ch == '(' || ch == '[' || ch == '{')  {
                st.push(ch);
            }

            else {
                //closing bracket
                if (st.isEmpty()) {
                    return false;
                }
                if (ch == ')' && st.peek() == '(' || ch == '}' && st.peek() == '{' || ch == ']' && st.peek() == '[') {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "({[]}))";
        System.out.println(isValidParentheses(s));
    }
}
