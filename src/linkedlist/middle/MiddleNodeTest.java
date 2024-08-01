package linkedlist.middle;

import linkedlist.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static linkedlist.TestLists.listStartingAt;
import static linkedlist.middle.MiddleNode.middleNode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MiddleNodeTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(listStartingAt(5, 1), 3),
                arguments(listStartingAt(6, 1), 4),
                arguments(listStartingAt(1, 1), 1),
                arguments(listStartingAt(3, 1), 2)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnCorrectMiddleNodeOfLinkedLst(ListNode list, int expectedMiddleNodeValue) {
        // given
        assertEquals(expectedMiddleNodeValue, middleNode(list).val);


        // when

        // then
    }
}