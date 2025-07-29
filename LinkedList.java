import java.util.Scanner;

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

    void delete_at_position(int pos) {

        if (head == null)
            return;

        if (pos == 0) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            delete_at_begin();
            return;
        }

        Node temp = head;
        Node front = null;

        while (pos > 1 && temp != null) {
            front = temp;
            temp = temp.next;
            pos--;
        }
        if (temp == null) {
            return;
        }
        front.next = temp.next;
        temp.next = null;

    }

    void search(int data) {
        if (head == null) {
            System.out.println("No data found list is empty");
            return;
        }
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Element found at position : " + pos);
                return;
            }
            pos++;
            temp = temp.next;
        }
        System.out.println("Element not found");
    }

    void count(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                cnt++;
            }
            temp = temp.next;
        }

        System.out.println("Element found " + cnt + " times");
    }

    int sum_of_alternative_nodes() {
        int res1 = 0;
        int res2 = 0;
        Node temp = head;
        while (temp != null && temp.next != null) {
            res1 += temp.data;
            res2 += temp.next.data;
            temp = temp.next.next;
        }
        if (temp != null) {
            res1 += temp.data;
        }

        return Math.abs(res1 - res2);
    }

}

public class LinkedList {
    public static void main(String[] args) {
        ListNode node = new ListNode();
        Scanner sc = new Scanner(System.in);

        /*
         * while (true) {
         * System.out.println("Menu driven linked list: ");
         * System.out.println("1. InsertEnd");
         * System.out.println("2.deleteBegin");
         * System.out.println("3.traversal");
         * System.out.println("4.Search");
         * 
         * System.out.println("Enter your choice: ");
         * int choice = sc.nextInt();
         * 
         * switch (choice) {
         * case 1:
         * System.out.println("Enter data to insert: ");
         * int data = sc.nextInt();
         * node.insert_at_end(data);
         * System.out.println("Element inserted");
         * break;
         * case 2:
         * node.delete_at_begin();
         * System.out.println("Element deleted");
         * break;
         * case 3:
         * node.traversal();
         * break;
         * case 4:
         * System.out.println("Enter element to search: ");
         * int ele = sc.nextInt();
         * node.search(ele);
         * break;
         * default:
         * System.out.println("Invalid choice");
         * }
         * System.out.println("Do you want to continue (y/n)");
         * char ch = sc.next().charAt(0);
         * if (ch == 'n')
         * return;
         * 
         * }
         */

        node.insert_at_begin(1);
        node.insert_at_begin(1);
        node.insert_at_begin(1);

        node.insert_at_end(1);
        node.insert_at_end(1);
        node.insert_at_end(1);
        node.insert_at_end(1);
        node.insert_at_end(1);
        node.insert_at_end(1);

        /*
         * System.out.println("Enter value to count: ");
         * int val = sc.nextInt();
         * node.count(val);
         */

        // node.insert_at_position(666, 4);

        // node.delete_at_begin();

        // node.delete_at_end();

        /*
         * node.delete_at_position(4);
         * 
         * node.traversal();
         */

        int res = node.sum_of_alternative_nodes();
        System.out.println(res);

    }
}
