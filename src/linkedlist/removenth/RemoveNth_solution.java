package linkedlist.removenth;

import linkedlist.ListNode;

public class RemoveNth_solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null){
            return null;
        }
        final var dummy = new ListNode(0, head);
        ListNode slowPointer = dummy, fastPointer = head;
        for (int i = 0; i < n - 1; i++) {
            if (fastPointer != null) {
                fastPointer = fastPointer.next;
            }
        }
        while (fastPointer!= null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        return dummy.next;
    }

}
