package com.practice.code;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class TestCode {
    public static void main(String args[]) throws IOException {
            GroupAnagrams49 groupAnagrams49 = new GroupAnagrams49();
            List<List<String>> output = groupAnagrams49.groupAnagrams(new String[]{"cab","tin","pew","duh","may","ill","buy","bar","max","doc"});
            System.out.println(output);
    }

}
