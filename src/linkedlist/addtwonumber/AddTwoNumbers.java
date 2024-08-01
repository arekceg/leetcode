package linkedlist.addtwonumber;

import linkedlist.ListNode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var firstPointer = l1;
        var secondPointer = l2;
        ListNode sumList = new ListNode();
        ListNode current = sumList;
        boolean carryOneOver = false;
        while (firstPointer != null || secondPointer != null) {
            int firstPointerValue = firstPointer == null ? 0 : firstPointer.val;
            int secondPointerValue = secondPointer == null ? 0 : secondPointer.val;
            var sum = firstPointerValue + secondPointerValue;
            if (carryOneOver) sum++;
            if (sum >= 10) {
                sum -= 10;
                carryOneOver = true;
            } else {
                carryOneOver = false;
            }
            current.next = new ListNode(sum);
            current = current.next;
            firstPointer = firstPointer == null ? null : firstPointer.next;
            secondPointer = secondPointer == null ? null : secondPointer.next;
        }
        if (carryOneOver){
            current.next = new ListNode(1);
        }
        return sumList.next;
    }
}

