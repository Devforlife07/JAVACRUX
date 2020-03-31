import java.util.*;

/**
 * trie
 */
public class trie {
    class node {
        char data;
        boolean isTerminal;
        HashMap<Character, node> children;

        node(char data, boolean isTerminal) {
            this.data = data;
            this.children = new HashMap<>();
            this.isTerminal = isTerminal;
        }

    }

    private int Numwords;
    private node root;

    trie() {
        this.root = new node('\0', false);
        this.Numwords = 0;
    }

    public int Numwords() {
        return this.Numwords;
    }

    public void addword(String word) {

    }

    private void addword(node parent, String word) {

    }
}