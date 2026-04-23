
public class RemoveNthNode_LC_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 0; i <= n; i++)
            fast = fast.next;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveNthNode_LC_19 obj = new RemoveNthNode_LC_19();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        ListNode res = obj.removeNthFromEnd(head, n);

        while (res != null) {
            System.out.print(res.val + " -> ");
            res = res.next;
        }
        System.out.println("null");
    }
}
