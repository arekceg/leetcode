package arrays.removelement;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;
import static org.junit.jupiter.api.Assertions.*;
import static utils.Utils.printArray;

class RemoveElementTest {

    @Test
    void test() {
        // given
        final var nums = new int[]{0,1,2,2,3,0,4,2};
        final var val = 2;
        final var expectedArray = new int[]{0,1,4,0,3, 2, 2, 2};

        // when
        printArray(nums);
        System.out.println("====================");
        final var count = RemoveElement.removeElement(nums, val);

        // then
        printArray(expectedArray);
        System.out.println("====================");
        printArray(nums);
        assertEquals(3, count);
        assertArrayEquals(expectedArray, nums);
    }

}