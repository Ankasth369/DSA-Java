import java.util.Stack;

public class MaxAreaInHistogram {
    //O(n)
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        //next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            }
            else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }
            else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current area = width * height ; width = j - i - 1; nsr[j] - nsl[i] - 1 
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = width * height;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Max Area in Histogram is " + maxArea);
    }
    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        maxArea(heights);
    }
}
