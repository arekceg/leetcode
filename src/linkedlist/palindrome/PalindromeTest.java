package linkedlist.palindrome;

import linkedlist.ListNode;
import linkedlist.TestLists;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static linkedlist.TestLists.noLoopList;
import static linkedlist.TestLists.palindromeListEven;
import static linkedlist.TestLists.palindromeListOdd;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PalindromeTest {


    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(palindromeListEven(), true),
                arguments(palindromeListOdd(), true),
                arguments(noLoopList(5), false),
                arguments(noLoopList(1), true)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnTrueIfListIsAPalindrome(ListNode list, boolean expectedResult) {
        // given
        System.out.println(TestLists.listToString(list) + " expected isPalindrome : " + expectedResult);

        // when

        // then
        assertEquals(expectedResult, Palindrome.isPalindrome(list));
    }

}