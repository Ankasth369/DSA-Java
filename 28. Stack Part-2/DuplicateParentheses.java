import java.util.Stack;

public class DuplicateParentheses {
    //O(n)
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {        //closing bracket
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else {
                s.push(ch);  //opening bracket, operand or operator
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(((a+b)+(c)))";
        System.out.println(isDuplicate(str));
    }
}
