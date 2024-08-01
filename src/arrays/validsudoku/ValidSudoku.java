package arrays.validsudoku;

import java.util.*;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        Set<String> charLog = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                final var currentChar = board[row][column];
                if (currentChar == '.') {
                    continue;
                }
                if (!charLog.add(currentChar + " seen in row " + row) ||
                        !charLog.add(currentChar + " seen in column " + column) ||
                        !charLog.add(currentChar + " seen in square " + row / 3 + " x " + column / 3)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidSudokuMapPlusSet(char[][] board) {
        Set<Character> rowDuplicatesControl = new HashSet<>();
        final Map<Integer, Set<Character>> columnsDuplicatesControl = new HashMap<>();
        final Map<Pair<Integer, Integer>, Set<Character>> squaresDuplicatesControl = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                final var currentChar = board[row][column];
                if (currentChar == '.') {
                    continue;
                }
                // check rows
                if (duplicateExistsInSet(rowDuplicatesControl, currentChar)) return false;

                // check columns
                columnsDuplicatesControl.computeIfAbsent(column, k -> new HashSet<>());
                if (duplicateExistsInSet(columnsDuplicatesControl.get(column), currentChar))
                    return false;

                // check squares
                int squareRowIndex = row / 3;
                int squareColumnIndex = column / 3;
                final var squareIndex = new Pair<Integer, Integer>(squareColumnIndex, squareRowIndex);
                squaresDuplicatesControl.computeIfAbsent(squareIndex, k -> new HashSet<>());
                if (duplicateExistsInSet(squaresDuplicatesControl.get(squareIndex), currentChar))
                    return false;

            }
            rowDuplicatesControl = new HashSet<>();
        }
        return true;
    }

    private static boolean duplicateExistsInSet(Set<Character> rowDuplicatesControl, char currentChar) {
        return !rowDuplicatesControl.add(currentChar);
    }

    private record Pair<T, T1>(T left, T1 right) {
    }
}
