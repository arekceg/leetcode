package linkedlist.reverse;

import linkedlist.ListNode;
import linkedlist.TestLists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static linkedlist.TestLists.*;
import static linkedlist.TestLists.backwardsNoLoopList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReverseTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(noLoopList(5), backwardsNoLoopList(5)),
                arguments(noLoopList(1), backwardsNoLoopList(1))
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void reverseLinkedListTest(ListNode sourceList, ListNode expectedReversedList) {
      // given
        assertEquals(expectedReversedList, Reverse.reverseList(sourceList));


      // when

      // then
    }

}