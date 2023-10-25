package arrays.mergesortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static utils.Utils.printArray;

class MergeSortedArrayTest {

    int[] firstArray;

    @Test
    void testRegularArrays() {
        // given
        firstArray = new int[]{1, 2, 3, 0, 0, 0};
        final var secondArray = new int[]{2, 5, 6};
        MergeSortedArray.merge(firstArray, 3, secondArray, 3);
        final var expectedArray = new int[]{1, 2, 2, 3, 5, 6};

        // when
        System.out.println("first:");
        printArray(firstArray);
        System.out.println("\n=======");
        System.out.println("expected:");
        printArray(expectedArray);

        // then
        assertArrayEquals(expectedArray, firstArray);
    }

    @Test
    void test2() {
        // given
        firstArray = new int[]{0};
        final var secondArray = new int[]{1};
        MergeSortedArray.merge(firstArray, 0, secondArray, 1);
        final var expectedArray = new int[]{1};

        // when
        System.out.println("first:");
        printArray(firstArray);
        System.out.println("\n=======");
        System.out.println("expected:");
        printArray(expectedArray);

        // then
        assertArrayEquals(expectedArray, firstArray);
    }

    @Test
    void test3() {
        // given
        firstArray = new int[]{1};
        final var secondArray = new int[]{};
        MergeSortedArray.merge(firstArray, 1, secondArray, 0);
        final var expectedArray = new int[]{1};

        // when
        System.out.println("first:");
        printArray(firstArray);
        System.out.println("\n=======");
        System.out.println("expected:");
        printArray(expectedArray);

        // then
        assertArrayEquals(expectedArray, firstArray);
    }

    @Test
    void test4() {
        // given
        firstArray = new int[]{2, 0};
        final var secondArray = new int[]{1};
        MergeSortedArray.merge(firstArray, 1, secondArray, 1);
        final var expectedArray = new int[]{1, 2};

        // when
        System.out.println("actual:");
        printArray(firstArray);
        System.out.println("\n=======");
        System.out.println("expected:");
        printArray(expectedArray);

        // then
        assertArrayEquals(expectedArray, firstArray);
    }


}