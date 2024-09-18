package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution208 {
    public static void main(String[] args) {

    }
}

class Trie {

//    private List<String> trieList;
//
//    public Trie() {
//        this.trieList = new ArrayList<>();
//    }
//
//    public void insert(String word) {
//        if (!search(word)) this.trieList.add(word);
//    }
//
//    public boolean search(String key) {
//        return this.trieList.stream().anyMatch(word -> word.equals(key));
//    }
//
//    public boolean startsWith(String prefix) {
//        return this.trieList.stream().anyMatch(word -> word.startsWith(prefix));
//    }

//    Node root;
//
//    public Trie() {
//        root = new Node();
//    }
//
//    public void insert(String word) {
//        root.insert(word, 0);
//    }
//
//    public boolean search(String word) {
//        return root.search(word, 0);
//    }
//
//    public boolean startsWith(String prefix) {
//        return root.startsWith(prefix, 0);
//    }
//
//    static class Node {
//        Node[] nodes;
//        boolean isEnd;
//
//        Node() {
//            nodes = new Node[26];
//        }
//
//        private void insert(String word, int idx) {
//            if (idx >= word.length()) return;
//            int i = word.charAt(idx) - 'a';
//            if (nodes[i] == null) {
//                nodes[i] = new Node();
//            }
//
//            if (idx == word.length() - 1) nodes[i].isEnd = true;
//            nodes[i].insert(word, idx + 1);
//        }
//
//        private boolean search(String word, int idx) {
//            if (idx >= word.length()) return false;
//            Node node = nodes[word.charAt(idx) - 'a'];
//            if (node == null) return false;
//            if (idx == word.length() - 1 && node.isEnd) return true;
//
//            return node.search(word, idx + 1);
//
//        }
//
//        private boolean startsWith(String prefix, int idx) {
//            if (idx >= prefix.length()) return false;
//            Node node = nodes[prefix.charAt(idx) - 'a'];
//            if (node == null) return false;
//            if (idx == prefix.length() - 1) return true;
//
//            return node.startsWith(prefix, idx + 1);
//        }
//    }


    boolean isEnd;
    Trie[] children;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        insert(word, 0);
    }

    private void insert(String word, int i) {
        if (i == word.length()) {
            isEnd = true;
            return;
        }

        char c = word.charAt(i);

        if (children[c - 'a'] == null) {
            children[c - 'a'] = new Trie();
        }

        children[c - 'a'].insert(word, i + 1);
    }

    public boolean search(String word) {
        return search(word, 0);
    }

    private boolean search(String word, int i) {
        if (word.length() == i) {
            return isEnd;
        }

        char c = word.charAt(i);

        if (children[c - 'a'] == null) {
            return false;
        }

        return children[c - 'a'].search(word, i + 1);
    }

    public boolean startsWith(String prefix) {
        return startsWith(prefix, 0);
    }

    private boolean startsWith(String word, int i) {
        if (word.length() == i) {
            return true;
        }

        char c = word.charAt(i);

        if (children[c - 'a'] == null) {
            return false;
        }

        return children[c - 'a'].startsWith(word, i + 1);
    }
}
