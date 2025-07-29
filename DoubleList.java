class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert_at_end(int data) {
        if (head == null) {
            Node newnode = new Node(data);
            head = newnode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        Node newnode = new Node(data);
        temp.next = newnode;
        newnode.prev = temp;
    }

    void insert_at_begin(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    void insert_at_position(int data, int pos) {
        if (pos <= 0)
            return;

        if (head == null || pos == 1) {
            insert_at_begin(data);
            return;
        }

        Node temp = head;

        while (temp != null && pos > 1) {
            temp = temp.next;
            pos--;
        }
        if (pos > 1) {
            System.out.println("Invalid position");
            return;
        }
        if (temp == null) {
            insert_at_end(data);
            return;
        }
        Node newnode = new Node(data);
        newnode.next = temp;
        newnode.prev = temp.prev;
        temp.prev.next = newnode;
        temp.prev = newnode;
    }

    void traversal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");

    }
}

public class DoubleList {
    public static void main(String[] args) {
        LinkedList node = new LinkedList();

        node.insert_at_end(100);
        node.insert_at_end(200);
        node.insert_at_end(300);

        node.insert_at_begin(30);
        node.insert_at_begin(20);
        node.insert_at_begin(10);

        node.insert_at_position(999, 5);

        node.traversal();
    }
}

