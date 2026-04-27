
public class List {

    static class MyLinkedList {

        class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

        Node head, tail;
        int c;

        public MyLinkedList() {
            head = tail = null;
            c = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= c) return -1;

            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            return temp.val;
        }

        public void addAtHead(int val) {
            Node nn = new Node(val);
            if (head == null) {
                head = tail = nn;
            } else {
                nn.next = head;
                head = nn;
            }
            c++;
        }

        public void addAtTail(int val) {
            Node nn = new Node(val);
            if (head == null) {
                head = tail = nn;
            } else {
                tail.next = nn;
                tail = nn;
            }
            c++;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > c) return;

            if (index == 0) {
                addAtHead(val);
                return;
            }
            if (index == c) {
                addAtTail(val);
                return;
            }

            Node nn = new Node(val);
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            nn.next = temp.next;
            temp.next = nn;
            c++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= c) return;

            if (index == 0) {
                head = head.next;
                c--;
                if (c == 0) tail = null;
                return;
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
            c--;
        }

        // 1. Insert at Beginning
        public void insertAtBeginning(int val) {
            addAtHead(val);
        }

        // 2. Insert at End
        public void insertAtEnd(int val) {
            addAtTail(val);
        }

        // 3. Insert at Position k (0-based)
        public void insertAtPosition(int k, int val) {
            addAtIndex(k, val);
        }

        // 4. Delete First Node
        public void deleteFirstNode() {
            deleteAtIndex(0);
        }

        // 5. Delete Last Node
        public void deleteLastNode() {
            if (c == 0) return;
            deleteAtIndex(c - 1);
        }

        // 6. Search an Element
        public boolean searchElement(int target) {
            Node temp = head;
            while (temp != null) {
                if (temp.val == target) return true;
                temp = temp.next;
            }
            return false;
        }

        // 7. Reverse a Linked List
        public void reverseLinkedList() {
            Node prev = null;
            Node curr = head;
            tail = head;

            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        // 8. Linked List Cycle (LeetCode 141 style)
        public boolean hasCycle() {
            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;

                if (fast == slow) {
                    return true;
                }
            }
            return false;
        }

        // 9. Count Number of Nodes
        public int countNumberOfNodes() {
            return c;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtPosition(1, 15);
        list.display();

        list.deleteFirstNode();
        list.deleteLastNode();
        list.display();

        System.out.println("Search 15: " + list.searchElement(15));

        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.reverseLinkedList();
        list.display();

        System.out.println("Has Cycle: " + list.hasCycle());
        System.out.println("Count: " + list.countNumberOfNodes());
    }
}
