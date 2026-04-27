public class SearchElement {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public boolean searchElement(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == target) return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchElement list = new SearchElement();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        System.out.println(list.searchElement(20));
    }
}