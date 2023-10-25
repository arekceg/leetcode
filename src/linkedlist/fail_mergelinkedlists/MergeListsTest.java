package linkedlist.fail_mergelinkedlists;

import linkedlist.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static linkedlist.TestLists.listToString;
import static linkedlist.TestLists.listStartingAt;
import static linkedlist.fail_mergelinkedlists.MergeLists.mergeTwoLists;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeListsTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(listStartingAt(9, 1), listStartingAt(5, 3), "1,2,3,3,4,4,5,5,6,6,7,7,8,9"),
                arguments(listStartingAt(9, 1), null, "1,2,3,4,5,6,7,8,9"),
                arguments(null, listStartingAt(5, 3), "3,4,5,6,7")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnCorrectlyMergedLikedLIst(ListNode firstList, ListNode secondList, String expectedListString) {
        // given

        assertEquals(expectedListString, listToString(mergeTwoLists(firstList, secondList)));

        // when

        // then
    }
}