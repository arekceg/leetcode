package linkedlist;

public class TestLists {

    public static String listToString(ListNode list) {
        if (list == null){
            return "";
        }
        final var stringBuilder = new StringBuilder();
        while (list != null) {
            stringBuilder.append(list.val).append(',');
            list = list.next;
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }

    public static ListNode noLoopList(int size) {
        final var head = new ListNode(1, null);
        var prev = head;
        for (int i = 2; i <= size; i++) {
            final var next = new ListNode(i, null);
            prev.next = next;
            prev = next;
        }
        return head;
    }

    public static ListNode palindromeListEven() {
        final var listNode1Last = new ListNode(1, null);
        final var listNode2Last = new ListNode(2, listNode1Last);
        final var listNode2First = new ListNode(2, listNode2Last);
        return new ListNode(1, listNode2First);
    }

    public static ListNode palindromeListOdd() {
        final var listNode1Last = new ListNode(1, null);
        final var listNode2Last = new ListNode(2, listNode1Last);
        final var listNode3 = new ListNode(3, listNode2Last);
        final var listNode2First = new ListNode(2, listNode3);
        return new ListNode(1, listNode2First);
    }


    public static ListNode listStartingAt(int size, int startValue) {
        final var head = new ListNode(startValue, null);
        var prev = head;
        for (int i = 2; i <= size; i++) {
            final var next = new ListNode(++startValue, null);
            prev.next = next;
            prev = next;
        }
        return head;
    }

    public static ListNode backwardsNoLoopList(int size) {
        final var head = new ListNode(size, null);
        var prev = head;
        for (int i = size - 1; i > 0; i--) {
            final var next = new ListNode(i, null);
            prev.next = next;
            prev = next;
        }
        return head;
    }
}

