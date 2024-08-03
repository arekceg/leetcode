package linkedlist.mergelinkedlists;

import linkedlist.ListNode;

public class MergeLists_solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var temp = new ListNode();
        var list1Pointer = list1;
        var list2Pointer = list2;
        var merged = temp;
        while (list1Pointer != null && list2Pointer != null) {
            if (list1Pointer.val < list2Pointer.val) {
                temp.next = list1Pointer;
                list1Pointer = list1Pointer.next;
            } else {
                temp.next = list2Pointer;
                list2Pointer = list2Pointer.next;
            }
            temp = temp.next;
        }
        if (list1Pointer == null) {
            temp.next = list2Pointer;
        } else {
            temp.next = list1Pointer;
        }

        return merged.next;
    }
}
