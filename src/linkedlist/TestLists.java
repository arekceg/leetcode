package linkedlist;

public class TestLists {

    public static String listToString(ListNode list) {
        final var stringBuilder = new StringBuilder();
        while (list != null) {
            stringBuilder.append(list.val).append(',');
            list = list.next;
        }
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
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

