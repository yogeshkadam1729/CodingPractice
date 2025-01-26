package com.practice.code;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class TestCode {
    public static void main(String args[]) throws IOException {


        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        searchInsertPosition.searchInsert(new int[]{1,3,5,6},5);
    }

}
