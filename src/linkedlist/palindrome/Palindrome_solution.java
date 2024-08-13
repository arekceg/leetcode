package linkedlist.palindrome;

import linkedlist.ListNode;

public class Palindrome_solution {
    public static boolean isPalindrome(ListNode head) {
        ListNode slowPointer = head, fastPointer = head;
        // find the middle node
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        // reverse the second half of the list
        var current = slowPointer;
        ListNode reversed = null;
        while (current != null) {
            var temp = current.next;
            current.next = reversed;
            reversed = current;
            current = temp;
        }

        // check for palindrome
        while (reversed != null && head != null){
            if (reversed.val != head.val){
                return false;
            }
            reversed = reversed.next;
            head = head.next;
        }
        return true;
    }
}