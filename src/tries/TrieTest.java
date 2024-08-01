package tries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {


    @Test
    void shouldInsertWord() {
        // given
        final var trie = new Trie();

        // when
        trie.insert("test");
        trie.insert("tempo");
        trie.insert("a");
        trie.insert("app");
        trie.insert("apple");
        trie.insert("appetite");

        // then
        assertTrue(trie.search("a"));
        assertTrue(trie.search("app"));
        assertTrue(trie.search("apple"));
        assertTrue(trie.search("appetite"));

    }
}