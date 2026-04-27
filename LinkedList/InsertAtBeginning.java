public class InsertAtBeginning {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public void insertAtBeginning(int val) {
        Node nn = new Node(val);
        nn.next = head;
        head = nn;
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
        InsertAtBeginning list = new InsertAtBeginning();
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.display();
    }
}