package linkedlist.reverse;

import linkedlist.ListNode;

public class Reverse {
    public static ListNode reverseList(ListNode head) {
        var currentNode = head;
        ListNode reversed = null;
        while (currentNode != null) {
            var temp = currentNode.next;
            currentNode.next = reversed;
            reversed = currentNode;
            currentNode = temp;
        }
        return reversed;
    }
}
