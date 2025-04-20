public class CircularQueueArr {
    static class CircularQueue {
        int arr[];
        int front;
        int rear;
        int size;

        CircularQueue(int size) {
            this.size = size;
            front = -1;
            rear = -1;
            arr = new int[size];
        }
        
        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public boolean isFull() {
            return (rear+1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Circular Queue is full");
                return;
            }

            //if adding our first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Circular Queue is empty");
            }

            int result = arr[front];
            
            // If last element is getting deleted
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % size;
            }

            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Circular Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        CircularQueue q = new CircularQueue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        q.remove();
        q.add(4);
        q.remove();
        q.add(5);

        // 1 2 3
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
