package LinkedList_Class;

public class implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0; // maintained counter

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++; // increase size
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++; // increase size
        }

        void inserAtIdx(int idx, int val) {
            if (idx == size) { // insert at end
                insertAtEnd(val);
                return;
            } else if (idx == 0) { // insert at head
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size) { // ✅ fixed missing ')'
                System.out.println("Wrong index");
                return;
            }

            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            // insertion step
            t.next = temp.next;
            temp.next = t;
            size++; // increase size    
        }

        int getAt(int idx) {
            if (idx < 0 || idx >= size) {
                throw new IndexOutOfBoundsException("Invalid index: " + idx);
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            // ✅ Approach 1: Dynamic counting (slower, O(n))
            /*
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
            */

            // ✅ Approach 2: Maintained counter (faster, O(1))
            return size;
        }

        void deleteAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Wrong index");
                return;
            }

            if (idx == 0) {
                head = head.next;
                if (head == null) tail = null; // if list becomes empty
                size--;
                return;
            }

            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size - 1) tail = temp; // update tail if last deleted
            size--;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1); // 1
        ll.display();
        ll.insertAtEnd(5); // 1 -> 5
        ll.display();
        ll.insertAtEnd(10); // 1 -> 5 -> 10
        ll.display();

        ll.insertAtHead(15);  // 15 -> 1 -> 5 -> 10
        ll.display();
        ll.inserAtIdx(2, 20); // 15 -> 1 -> 20 -> 5 -> 10
        ll.display();

        System.out.println("Size of list: " + ll.size()); // ✅ test size method
    }
}
