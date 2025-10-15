package LinkedList_Class;

public class Basicll {

    // Node class to represent each element in the linked list
    public static class Node {
        int data;  // value
        Node next; // reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive function to display linked list (forward order)
    public static void displayRecursive(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayRecursive(head.next);
    }

    // Function to print the linked list in reverse order (recursive)
    public static void displayReverseRecursive(Node head) {
        if (head == null) return;
        displayReverseRecursive(head.next);
        System.out.print(head.data + " ");
    }

    // Function to calculate the length of the linked list
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {

        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(9);

        // connecting the nodes to each other
        a.next = b;
        b.next = c;
        c.next = d;

        // ------------------------------
        // DIFFERENT WAYS TO PRINT A LINKED LIST
        // ------------------------------

        // (1) Manually (not practical, just for learning)
        System.out.println("Printing manually:");
        System.out.print(a.data + " ");
        System.out.print(a.next.data + " ");
        System.out.print(a.next.next.data + " ");
        System.out.print(a.next.next.next.data + " ");
        System.out.println();

        // (2) Iterative way using a while loop
        System.out.println("Printing iteratively (while loop):");
        Node temp1 = a;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
        System.out.println();

        // (3) Iterative way using a for loop
        System.out.println("Printing iteratively (for loop):");
        for (Node temp2 = a; temp2 != null; temp2 = temp2.next) {
            System.out.print(temp2.data + " ");
        }
        System.out.println();

        // (4) Recursive way (forward order)
        System.out.println("Printing recursively (forward):");
        displayRecursive(a);
        System.out.println();

        // (5) Recursive way (reverse order)
        System.out.println("Printing recursively (reverse):");
        displayReverseRecursive(a);
        System.out.println();

        // Length of linked list
        System.out.println("Length of the linked list: " + length(a));
    }
}
