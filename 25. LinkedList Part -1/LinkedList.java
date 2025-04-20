public class LinkedList {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //O(1)
    public void addFirst(int data) {
        //Step 1: Create a new node
        Node newNode = new Node(data);
        size++;

        //If our linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
            
        //Step 2: newNode.next -> head
        newNode.next = head;
        
        //Step 3: Make newNode the head
        head = newNode;   //link or reference

    }

    //O(1)
    public void addLast(int data) {
        //Step 1: Create a new node
        Node newNode = new Node(data);
        size++;

        //If our linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step 2: Tail.next = newNode
        tail.next = newNode;

        //Step 3: Make our new node the tail
        tail = newNode;

    }

    //Time complexity: O(n)
    public void print() {
        //Underflow condition
        if (head == null) {
            System.out.println("Linked List is empty");
            return; 
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // O(n)
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        //i == idx - 1 : temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //O(1)-constant operations
    public int removeFirst() {
        if (size == 0) {  // or head == null
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // O(1)
    public int removeLast() {
        if (size == 0) {  // or head == null
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node prev = head;
        int i = 0;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }
        int val = tail.data;
        prev.next = null; 
        tail = prev;
        size--;
        return val;
    }

    // O(n)
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {  //key found
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }
    //Time complexity: O(n) and Space Complexity O(n) because of helper function
    public int recSearch(int key) {
        return helper(head, key);
    }

    // O(n)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //O(n)
    public void removeNthNodeFromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (sz == n) {
            head = head.next;  //removeFirst
            size--;
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next =  prev.next.next;
        size--;
    }
    // Hare and Turtoise or Slow-fast pointer approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;     // +1 step
            fast = fast.next.next; // +2 step
        }
        return slow;  // slow is out mid node
    }

    // O(n)
    public boolean checkPalindrome() {
        if (head == null || head.next != null) {
            return true;
        }

        //Step 1: Find mid
        Node midNode = findMid(head);
        
        //Step 2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;  // left half head

        //Step 3: check if left half = right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2, 9);
        ll.print();
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(ll.removeLast());
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(13));
        ll.reverse();
        ll.print();
        ll.addLast(10);
        ll.print();
        ll.removeNthNodeFromEnd(2);
        ll.print();
        System.out.println(ll.checkPalindrome());

    }
}
