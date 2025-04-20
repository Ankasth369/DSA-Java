
public class BinaryTreeHeight {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //Time Complextiy: O(n) and Space Complexity: O(h) ->height of tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static void main(String[] args) {
        /*
            1
           / \
          2   3
         / \   
        4   5  
             \
              6
               \ 
                7      
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        System.out.println(height(root));
    }
}
