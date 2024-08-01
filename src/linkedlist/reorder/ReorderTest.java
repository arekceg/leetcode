package linkedlist.reorder;

import linkedlist.ListNode;
import linkedlist.TestLists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static linkedlist.TestLists.listToString;
import static linkedlist.TestLists.noLoopList;
import static linkedlist.reorder.Reorder.reorderList;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReorderTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(noLoopList(5)),
                arguments(noLoopList(6))
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReorderLinkedList(ListNode list) {
      // given
        System.out.println(listToString(list));
        reorderList(list);
        System.out.println(listToString(list));


      // when

      // then
    }

}