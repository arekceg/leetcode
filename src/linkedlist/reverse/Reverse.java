package linkedlist.reverse;

import linkedlist.ListNode;

public class Reverse {
    public static ListNode reverseList(ListNode head) {
        ListNode reversed = null, current = head;
        while (current != null){
            final var temp = current.next;
            current.next = reversed;
            reversed = current;
            current = temp;
        }
        return reversed;
    }
}
