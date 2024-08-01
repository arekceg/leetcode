package linkedlist.middle;

import linkedlist.ListNode;

//    https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleNode {
    public static ListNode middleNode(ListNode head) {
        ListNode slowPointer = head, fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }
}
