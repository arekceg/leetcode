package stacks.minstack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    @Test
    void shouldAddElementToStack() {
        // given
        final var stack = new MinStack();

        // when
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(8);

        // then
        assertEquals(8, stack.top());
        assertEquals(1, stack.getMin());
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(2, stack.getMin());
    }

    @Test
    void shouldReturnLastElementAddedToStack() {
        // given
        final var stack = new MinStack();

        // when
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(8);
        stack.push(-1);

        // then
        assertEquals(-1, stack.top());
    }

    @Test
    void test() {
        // given
        final var stack = new MinStack();

        // when
        stack.push(-2);
        stack.push(0);
        stack.push(-3);

        // then
        assertEquals(-3, stack.getMin());
        stack.pop();
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }
}