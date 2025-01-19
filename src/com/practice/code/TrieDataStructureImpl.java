package com.practice.code;

public class TrieDataStructureImpl {
    private TrieNode trie = null;
    private Character a= 'a';

    public TrieDataStructureImpl() {
        trie = new TrieNode('\0');
    }
    public void insert(String word) {
        TrieNode temp = trie;
        for(char c : word.toCharArray()) {
            int indexOfTrie = c-a;
            if(temp.arr[indexOfTrie] == null)
                temp.arr[indexOfTrie] = new TrieNode(c);
            temp = temp.arr[indexOfTrie];
        }
        temp.isWord = true;
    }
    public boolean search(String word) {
        TrieNode temp = trie;
        for(char c : word.toCharArray()) {
            int indexOfTrie = c-a;
            if(temp.arr[indexOfTrie] == null)
                return false;
            temp = temp.arr[indexOfTrie];
        }
        return temp.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode temp = trie;
        for(char c : prefix.toCharArray()) {
            int indexOfTrie = c-a;
            if(temp.arr[indexOfTrie] == null)
                return false;
            temp = temp.arr[indexOfTrie];
        }
        return true;
    }
}
class TrieNode {
    char c;
    TrieNode[] arr = new TrieNode[26];
    boolean isWord = false;

    TrieNode(char c) {
        this.c = c;
    }
}

