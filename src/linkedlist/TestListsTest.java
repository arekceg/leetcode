package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestListsTest {


    @Test
    void test() {
        // given
        final var listNode = TestLists.backwardsNoLoopList(5);

        // when
        assertNotNull(listNode);

        // then
    }
}