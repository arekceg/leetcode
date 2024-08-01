package linkedlist.addtwonumber;

import linkedlist.ListNode;
import linkedlist.TestLists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static linkedlist.TestLists.listStartingAt;
import static linkedlist.TestLists.noLoopList;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AddTwoNumbersTest {

    public static Stream<Arguments> dataProvider() {
        final var node3 = new ListNode(4, null);
        final var node2 = new ListNode(6, node3);
        final var summedList = new ListNode(8, node2);
        return of(
                arguments(listStartingAt(3, 7), listStartingAt(4, 6), summedList )
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldAddTwoLinkedListAsReversedNumbers(ListNode firsList, ListNode secondList, ListNode expectedList) {
      // given

      // when
        System.out.println(TestLists.listToString(firsList));
        System.out.println("+");
        System.out.println(TestLists.listToString(secondList));
        final var summedList = AddTwoNumbers.addTwoNumbers(firsList, secondList);
        System.out.println("=");
        System.out.println(TestLists.listToString(summedList));

        // then
        assertEquals(expectedList, summedList);
    }

}