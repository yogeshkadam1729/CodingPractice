package com.practice.code;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class TestCode {
    public static void main(String args[]) throws IOException {
        SurroundedRegion130 surroundedRegion130 = new SurroundedRegion130();
        char [][]board = {{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};
        surroundedRegion130.solve(board);
    }

}
