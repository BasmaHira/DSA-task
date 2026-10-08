public class CircularQueue {

    int[] queue = new int[5];

    int front = -1;
    int rear = -1;

    // Enqueue
    void enqueue(int data) {

        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue is full.");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % queue.length;

        queue[rear] = data;

        System.out.println(data + " added to queue.");
    }

    // Dequeue
    void dequeue() {

        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println(queue[front] + " removed from queue.");

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    // Display
    void display() {

        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Circular Queue:");

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(60);
        queue.enqueue(70);

        queue.display();
    }
}

