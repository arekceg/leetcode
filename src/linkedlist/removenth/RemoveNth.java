package linkedlist.removenth;

import linkedlist.ListNode;

public class RemoveNth {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstPointer = head;
        ListNode secondPointer = head;
        for (int i = 1; i <= n; i++) {
            secondPointer = secondPointer.next;
        }
        if (secondPointer == null){
            return head.next;
        }
        while (secondPointer.next != null) {
            secondPointer = secondPointer.next;
            firstPointer = firstPointer.next;
        }
        firstPointer.next = firstPointer.next.next;
        return head;

    }
}
