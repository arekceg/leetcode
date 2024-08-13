package linkedlist.palindrome;

import linkedlist.ListNode;

import java.rmi.server.RMIClassLoader;

public class Palindrome {
    public static boolean isPalindrome(ListNode head) {
        var mid = findMiddle(head);
        var reversed = reverse(mid);
        while (head != null && reversed != null){
            if (head.val != reversed.val){
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }

    private static ListNode findMiddle(ListNode head) {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static ListNode reverse(ListNode head){
        ListNode reversed = null, current = head;
        while (current != null){
            var temp = current.next;
            current.next = reversed;
            reversed = current;
            current = temp;
        }
        return reversed;

    }
}
