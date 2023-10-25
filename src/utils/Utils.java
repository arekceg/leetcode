package utils;

import com.sun.source.tree.BinaryTree;

public class Utils {

    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(',');
        }
        System.out.println(sb.append("\n"));
    }
}
