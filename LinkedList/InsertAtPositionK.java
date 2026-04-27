public class InsertAtPositionK {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public void insertAtPosition(int k, int val) {
        if (k < 0) return;

        Node nn = new Node(val);
        if (k == 0) {
            nn.next = head;
            head = nn;
            return;
        }

        Node temp = head;
        for (int i = 0; i < k - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;

        nn.next = temp.next;
        temp.next = nn;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtPositionK list = new InsertAtPositionK();
        list.head = new Node(10);
        list.head.next = new Node(30);
        list.insertAtPosition(1, 20);
        list.display();
    }
}