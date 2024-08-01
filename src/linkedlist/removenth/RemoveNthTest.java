package linkedlist.removenth;

import linkedlist.ListNode;
import linkedlist.TestLists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static linkedlist.TestLists.noLoopList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveNthTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(noLoopList(5), 3, "1,2,4,5"),
                arguments(noLoopList(10), 3, "1,2,3,4,5,6,7,9,10"),
                arguments(noLoopList(2), 2, "2"),
                arguments(noLoopList(2), 1, "1"),
                arguments(new ListNode(1, null), 1, "")
        );
        // 1 2 3 4 5
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldRemoveNthNodeFromLinkedList(ListNode list, int indexToRemove, String expectedListString) {
        // given

        // when
        final var listNode = RemoveNth.removeNthFromEnd(list, indexToRemove);

        // then
        final var listString = TestLists.listToString(listNode);
        assertEquals(expectedListString, listString);
    }

}