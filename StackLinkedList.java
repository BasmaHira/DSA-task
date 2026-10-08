import java.util.Scanner;

public class StackLinkedList {

    // Node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;

        System.out.println("Roll number added.");
    }

    // Pop
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Removed roll number: " + top.data);
            top = top.next;
        }
    }

    // Display
    void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            Node temp = top;

            System.out.println("Roll numbers:");

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StackLinkedList stack = new StackLinkedList();

        int choice;

        while (true) {

            System.out.println("\n--- Student Roll Number Stack ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter roll number: ");
                int rollNumber = input.nextInt();

                stack.push(rollNumber);

            } else if (choice == 2) {

                stack.pop();

            } else if (choice == 3) {

                stack.display();

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