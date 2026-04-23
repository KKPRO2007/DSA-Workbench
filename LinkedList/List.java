
public class List {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    static class MyLinkedList {
        Node head;
        Node tail;

        // 1. Insert at Beginning
        void insertAtBeginning(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        // 2. Insert at End
        void insertAtEnd(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // 3. Delete First Node
        void deleteFirst() {
            if (head == null) return;

            head = head.next;

            if (head == null)
                tail = null;
        }

        // 4. Delete Last Node
        void deleteLast() {
            if (head == null) return;

            if (head.next == null) {
                head = tail = null;
                return;
            }

            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }

        // 5. Count Nodes
        int count() {
            int cnt = 0;
            Node temp = head;

            while (temp != null) {
                cnt++;
                temp = temp.next;
            }
            return cnt;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);

        list.display(); // 5 -> 10 -> 20 -> null

        list.deleteFirst();
        list.display(); // 10 -> 20 -> null

        list.deleteLast();
        list.display(); // 10 -> null

        System.out.println("Count: " + list.count());
    }
}
