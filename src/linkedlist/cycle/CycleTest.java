package linkedlist.cycle;

import linkedlist.ListNode;
import linkedlist.TestLists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static linkedlist.cycle.Cycle.hasCycle;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CycleTest {

    public static Stream<Arguments> dataProvider() {
        return of(
//                arguments(TestLists.listWithLoopAtTheEnd(5), true),
                arguments(TestLists.noLoopList(5), false)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnTrueIfLinkedListHasACycle(ListNode list, boolean expectedResult) {
      // given
        assertEquals(expectedResult, hasCycle(list));

      // when

      // then
    }

}