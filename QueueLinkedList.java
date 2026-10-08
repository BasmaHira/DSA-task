import java.util.Scanner;

public class QueueLinkedList {

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
    void enqueue(int token) {

        Node newNode = new Node(token);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Token added to queue.");
    }

    // Dequeue
    void dequeue() {

        if (front == null) {
            System.out.println("Queue is empty.");
        } else {

            System.out.println("Served token: " + front.data);

            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    // Display
    void display() {

        if (front == null) {
            System.out.println("Queue is empty.");
        } else {

            Node temp = front;

            System.out.println("Bank Tokens:");

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        QueueLinkedList queue = new QueueLinkedList();

        int choice;

        while (true) {

            System.out.println("\n--- Bank Token Queue ---");
            System.out.println("1. Add Token");
            System.out.println("2. Serve Token");
            System.out.println("3. Display Tokens");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter token number: ");
                int token = input.nextInt();

                queue.enqueue(token);

            } else if (choice == 2) {

                queue.dequeue();

            } else if (choice == 3) {

                queue.display();

            } else if (choice == 4) {

                System.out.println("Program ended.");
                break;

            } else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}