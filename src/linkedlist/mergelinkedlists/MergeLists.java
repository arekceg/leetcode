package linkedlist.mergelinkedlists;

import linkedlist.ListNode;

public class MergeLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var worker = new ListNode();
        var merge = worker;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                worker.next = list1;
                list1 = list1.next;
            } else {
                worker.next = list2;
                list2 = list2.next;
            }
            worker = worker.next;
        }
        if (list1 == null) {
            worker.next = list2;
        } else {
            worker.next = list1;
        }
        return merge.next;
    }
}
