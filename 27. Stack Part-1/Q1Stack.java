import java.util.Stack;

public class Q1Stack {
    //A function to insert an element at bottom of stack.
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int data = 4;
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        pushAtBottom(s, data);
        System.out.println(s);
        // or use while to visualize stack
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
