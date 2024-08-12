package com.practice;

public class TrieDataStructureImpl {
    static TrieNode trie = new TrieNode('\0',false);
    static Character a= 'a';
    public void insert(String word) {
        TrieNode temp = trie;
        for(int i =0; i<word.length();i++) {
            char c = word.charAt(i);
            if(temp.arr[c-a] == null)
                temp.arr[c-a] = new TrieNode(c,i == word.length()-1);
            temp = temp.arr[c-a];
        }
    }
    public boolean search(String word) {
        TrieNode temp = trie;
        for(int i =0; i<word.length();i++) {
            char c = word.charAt(i);
            if(temp.arr[c-a] == null)
                return false;
            temp = temp.arr[c-a];
        }
        return temp.isWord;
    }

}
class TrieNode {
    char c;
    TrieNode[] arr = new TrieNode[26];
    boolean isWord = false;

    TrieNode(char c ,boolean isWord) {
        this.c = c;
        this.isWord = isWord;
    }
}

