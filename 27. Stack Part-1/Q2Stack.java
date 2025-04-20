import java.util.Stack;

public class Q2Stack {
    //Reverse a string using stack
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseString(s));
    }
}
