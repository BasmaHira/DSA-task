public class QueueLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // Enqueue
    void enqueue(int data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " added to queue.");
    }

    // Dequeue
    void dequeue() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println(front.data + " removed from queue.");

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Display
    void display() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue:");

        Node temp = front;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        queue.dequeue();

        queue.display();
    }
}
