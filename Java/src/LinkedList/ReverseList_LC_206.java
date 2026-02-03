package LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseList_LC_206 {

    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }

    public static void main(String[] args) {
        ReverseList_LC_206 obj = new ReverseList_LC_206();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode res = obj.reverseList(head);

        while (res != null) {
            System.out.print(res.val + " -> ");
            res = res.next;
        }
        System.out.println("null");
    }
}