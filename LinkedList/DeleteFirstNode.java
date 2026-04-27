public class DeleteFirstNode {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public void deleteFirstNode() {
        if (head == null) return;
        head = head.next;
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
        DeleteFirstNode list = new DeleteFirstNode();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.deleteFirstNode();
        list.display();
    }
}