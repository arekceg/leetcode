package tries;

import java.util.Arrays;
import java.util.Objects;

public class Trie {

    private final Node root;

    public Trie() {
        root = new Node('\0', new Node[26], false);
    }

    public void insert(String word) {
        Node currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            final var currentChar = word.charAt(i);
            final int charIndex = currentChar - 'a';
            var nextNode = currentNode.branches[charIndex];
            if (nextNode == null) {
                nextNode = new Node(currentChar, new Node[26], false);
            }
            currentNode.branches[charIndex] = nextNode;
            currentNode = nextNode;
        }
        currentNode.setEndOfWord(true);
    }

    private Node findNodeForWord(String word) {
        Node currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            final var currentChar = word.charAt(i);
            final int charIndex = currentChar - 'a';
            final var existingNode = currentNode.branches[charIndex];
            if (existingNode == null) {
                return null;
            }
            currentNode = existingNode;
        }
        return currentNode;
    }

    public boolean search(String word) {
        final var node = findNodeForWord(word);
        return node != null && node.endOfWord;
    }

    public boolean startsWith(String prefix) {
        final var node = findNodeForWord(prefix);
        return node != null;
    }

    private static final class Node {
        private final char value;
        private final Node[] branches;
        private boolean endOfWord;

        public Node setEndOfWord(boolean endOfWord) {
            this.endOfWord = endOfWord;
            return this;
        }

        private Node(char value, Node[] branches, boolean endOfWord) {
            this.value = value;
            this.branches = branches;
            this.endOfWord = endOfWord;
        }
        public char value() {
            return value;
        }

        public Node[] branches() {
            return branches;
        }

        public boolean endOfWord() {
            return endOfWord;
        }

    }

}
