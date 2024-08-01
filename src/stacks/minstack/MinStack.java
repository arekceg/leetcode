package stacks.minstack;

public class MinStack {

    private Node head;

    public void push(int val) {
        head = head == null ?
                new Node(val, val, null) :
                new Node(val, Math.min(val, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }

    private record Node(int value, int min, Node next) {
    }
}
