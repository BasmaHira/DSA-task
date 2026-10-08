public class StackLinkedList {

    // Node class
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

        System.out.println(data + " pushed into stack.");
    }

    // Pop
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    // Display
    void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack:");

        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.pop();

        stack.display();
    }
}