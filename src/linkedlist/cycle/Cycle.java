package linkedlist.cycle;

import linkedlist.ListNode;

public class Cycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slowPointer = head, fastPointer = head;
        while (slowPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }
}
