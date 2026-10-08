import java.util.Scanner;

public class CircularQueue {

    int[] queue = new int[5];

    int front = -1;
    int rear = -1;

    // Enqueue
    void enqueue(int job) {

        if ((rear + 1) % queue.length == front) {

            System.out.println("Queue is full.");

        } else {

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % queue.length;

            queue[rear] = job;

            System.out.println("Print job added.");
        }
    }

    // Dequeue
    void dequeue() {

        if (front == -1) {

            System.out.println("Queue is empty.");

        } else {

            System.out.println("Printed job: " + queue[front]);

            if (front == rear) {

                front = -1;
                rear = -1;

            } else {

                front = (front + 1) % queue.length;
            }
        }
    }

    // Display
    void display() {

        if (front == -1) {

            System.out.println("Queue is empty.");

        } else {

            System.out.println("Print Jobs:");

            int i = front;

            while (true) {

                System.out.println(queue[i]);

                if (i == rear) {
                    break;
                }

                i = (i + 1) % queue.length;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CircularQueue queue = new CircularQueue();

        int choice;

        while (true) {

            System.out.println("\n--- Printer Job Circular Queue ---");
            System.out.println("1. Add Print Job");
            System.out.println("2. Print Job");
            System.out.println("3. Display Jobs");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter job number: ");
                int job = input.nextInt();

                queue.enqueue(job);

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