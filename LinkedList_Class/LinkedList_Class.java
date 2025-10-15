package LinkedList_Class;

public class LinkedList_Class {

    // Node class (inner class)
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // ✅ fixed
    public static Node tail;

    // Add at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print the linked list
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        LinkedList_Class li = new LinkedList_Class();

        li.print();           // Should show "LL is empty"
        li.addFirst(2);       // List: 2
        li.print();
        li.addFirst(1);       // List: 1 -> 2
        li.print();
        li.addLast(3);        // List: 1 -> 2 -> 3
        li.print();
        li.addLast(4);        // List: 1 -> 2 -> 3 -> 4
        li.print();
    }
}
