package linkedlist.mergelinkedlists;

import linkedlist.ListNode;

public class MergeLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var firstPointer = list1;
        var secondPointer = list2;
        final var mergedList = new ListNode();
        var current = mergedList;
        while (firstPointer != null && secondPointer != null) {
            ListNode nextNode;
            if (firstPointer.val > secondPointer.val) {
                nextNode = secondPointer;
                secondPointer = secondPointer.next;
            } else {
                nextNode = firstPointer;
                firstPointer = firstPointer.next;
            }
            current.next = nextNode;
            current = current.next;
        }
        if (firstPointer == null) {
            current.next = secondPointer;
        } else {
            current.next = firstPointer;
        }
        return mergedList.next;
    }
}
