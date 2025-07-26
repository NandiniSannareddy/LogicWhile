class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListNode {
    Node head;

    void traversal() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void insert_at_begin(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void insert_at_end(int data) {
        Node newnode = new Node(data);
        newnode.next = null;
        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;

    }

    void insert_at_position(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            insert_at_begin(data);
        } else {
            Node newnode = new Node(data);
            Node temp = head;
            while (pos > 2 && temp != null) {
                temp = temp.next;
                pos--;
            }
            Node front = temp.next;
            temp.next = newnode;
            newnode.next = front;

        }
    }

    void delete_at_begin() {
        if (head == null)
            return;

        Node newnode = head.next;
        head.next = null;
        head = newnode;

    }

    void delete_at_end() {
        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        Node front = null;
        while (temp.next != null) {
            front = temp;
            temp = temp.next;
        }
        front.next = null;

    }

}

public class LinkedList {
    public static void main(String[] args) {
        ListNode node = new ListNode();

        // node.insert_at_begin(999);
        // node.insert_at_begin(888);
        // node.insert_at_begin(777);

        node.insert_at_end(111);
        node.insert_at_end(222);
        node.insert_at_end(333);

        // node.insert_at_position(666, 4);

        // node.delete_at_begin();

        node.delete_at_end();

        node.traversal();
    }
}
