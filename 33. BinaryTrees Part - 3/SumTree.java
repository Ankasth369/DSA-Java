public class SumTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //Time Complexity: O(n) and Space Complexity: O(h)
    public static int transformSumTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transformSumTree(root.left);
        int rightChild = transformSumTree(root.right);
        int data = root.data;
        int newLeft = root.left == null? 0: root.left.data;
        int newRight = root.right == null? 0: root.right.data;
        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        /*
            1
           / \
          2   3
         / \ / \
        4  5 6  7  
         */
        transformSumTree(node);
        /*
         Expected SumTree
                27
               /  \
              9   13
             / \ /  \
            0  0 0   0
         */
        System.out.println(node.data);
    }
}
