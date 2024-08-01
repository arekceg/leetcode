package linkedlist.reorder;

import linkedlist.ListNode;

public class Reorder {
    public static void reorderList(ListNode head) {
        var slowPointer = head;
        var fastPointer = head;
        // find the middle of the list
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        // slow pointer marks the middle of the list
        // fast pointer marks the end of the list
        // reverse the second part of the list
        ListNode reversed = null;
        ListNode current = slowPointer;
        while (current != null) {
            var temp = current.next;
            current.next = reversed;
            reversed = current;
            current = temp;
        }

        // Reorder the list
        ListNode workingHead = head;
        while (reversed!= null && reversed.next != null){
            var temp = workingHead.next;
            var revTemp = reversed.next;
            reversed.next = temp;
            workingHead.next = reversed;
            reversed = revTemp;
            workingHead = workingHead.next.next;
        }
    }
}
