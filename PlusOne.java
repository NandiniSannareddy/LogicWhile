import java.util.List;
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

    Node reverse(Node temp) {
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    void traversal(Node head) {
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

}

public class PlusOne {
    public static void main(String[] args) {
        ListNode node = new ListNode();

        node.insert_at_end(1);
        node.insert_at_end(9);
        node.insert_at_end(9);
        node.insert_at_end(9);

        Node temp = node.head;
        Node r = node.reverse(temp);

        int carry = 1;

        Node ans = null;
        Node res = null;

        while (r != null) {
            int sum = r.data + carry;
            carry = sum / 10;
            sum %= 10;
            Node newnode = new Node(sum);
            if (ans == null) {
                ans = newnode;
                res = ans;
            } else {
                res.next = newnode;
                res = res.next;
            }
            r = r.next;
        }

        if (carry != 0) {
            Node newnode = new Node(carry);
            res.next = newnode;
            res = res.next;
        }

        Node t = node.reverse(ans);
        node.traversal(t);

    }
}
