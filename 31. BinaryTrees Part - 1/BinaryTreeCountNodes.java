public class BinaryTreeCountNodes {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //Time Complextiy: O(n) and Space Complexity: O(height of tree)
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);
        return lc + rc  + 1;
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
        System.out.println(count(root));
    }
}
