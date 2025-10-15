package LinkedList_Class;

public class NthNodeFromLast {

    public static Node nthNode(Node head, int n) {
        // SIZE
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int m = size - n + 1;
        // m-th node from the start
        temp = head;
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    //Delete the Nth node from the end
    public static Node deleteNthFromend(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }

        // If we need to delete the head node
        if (fast.next == null) {
            head = head.next;
            return head;
        }

        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    public static void dispaly(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Linked List: 100 -> 13 -> 4 -> 5 -> 12 -> 10

//        Node temp = nthNode(a, 3);   // 3rd node from last -> 5
//        Node temp2 = nthNode2(a, 3); // 3rd node from last -> 5
//
//        System.out.println(temp.data);
//        System.out.println(temp2.data);
        a = deleteNthFromend(a, 2);
        dispaly(a);
    }
}
