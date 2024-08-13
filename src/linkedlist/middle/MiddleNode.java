package linkedlist.middle;

import linkedlist.ListNode;

public class MiddleNode {
    public static ListNode middleNode(ListNode head) {
        var fast = head;
        var slow = head;
        while (fast!= null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
