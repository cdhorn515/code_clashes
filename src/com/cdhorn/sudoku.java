package com.cdhorn;

import java.util.HashMap;
import java.util.Scanner;

public class sudoku {

    public static void Sudoku(String[] args) {

        System.out.println("This program lets you know any numbers that are missing between 0-9. Please enter a " +
                "number you would like to check: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] sArray = s.split("");
        HashMap<String, Integer> sudoku = new HashMap();
        for (int i = 0; i < sArray.length; i++) {
            sudoku.put(sArray[i], 1);
        }
        for (int i = 0; i < 10; i++) {
            String iString = Integer.toString(i);
            if (sudoku.containsKey(iString)) {
                continue;
            } else {
                System.out.println(iString);
            }
        }
    }

}
