import java.util.*;
public class BinaryTreeTraversal {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   //Time Complextiy: O(n) and Space Complexity: O(h)-> O(logn) in balanced tree and O(n) in case of skewed tree.
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
   //Time Complextiy: O(n) and Space Complexity: O(h)-> O(logn) in balanced tree and O(n) in case of skewed tree.
    public  static void inorder(Node root) {
        if ( root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
  //Time Complextiy: O(n) and Space Complexity: O(h)-> O(logn) in balanced tree and O(n) in case of skewed tree.
    public  static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    //Time Complextiy: O(n) and Space Complexity: O(n).
    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data  + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        /*
            1
           / \
          2   3
         / \ / \
        4  5 6  7      
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println();
        System.out.println("Preorder:");
        preorder(root);
        System.out.println();
        System.out.println("Inorder:");
        inorder(root);
        System.out.println();
        System.out.println("Postorder:");
        postorder(root);
        System.out.println();
        System.out.println("Levelorder:");
        levelorder(root);
    }
}
