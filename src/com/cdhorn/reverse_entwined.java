package com.cdhorn;

import java.util.Scanner;

/**
 * Input
 Holiday
 Output
 HyoaldiidlaoyH
 */
public class reverse_entwined {
    public static void main(String args[]) {
        System.out.println("Enter a word or phrase you want to check: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        char[] letters = s.toCharArray();
        char[] backwards = new char[letters.length];
        for (int i = letters.length-1; i>=0; i--) {
            backwards[i] = letters[i];
        }

        StringBuilder combined = new StringBuilder();
        for (int i = 0; i<letters.length; i++) {
            combined.append(String.format("%s%s", letters[i], backwards[letters.length-(i+1)]));
        }

        System.out.println(combined);
    }
}
