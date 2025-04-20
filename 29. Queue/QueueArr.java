public class QueueArr {
    static class Queue {
        int arr[];
        int size;
        int rear = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        boolean isEmpty() {
            return rear == -1;
        }

        void add(int data) {
            //Overflow
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        int remove() {
            // Underflow
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front  = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        int peek() {
            // Underflow
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
