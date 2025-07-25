package LinkedList_Class;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreateAndConnectNodes {

    public static void main(String[] args) {

        // Step 1: Create nodes
        Node node1 = new Node(10);
        Node node2 = new Node(99);
        Node node3 = new Node(30); // ✅ Add this line

        // Step 2: Connect the nodes
        node1.next = node2;
        node2.next = node3;

        // Step 3: Print the linked list
        Node temp = node1;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
