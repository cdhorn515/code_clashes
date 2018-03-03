package com.cdhorn;

import java.util.Scanner;

/**
 * Given a series of letters, your program must find the first one that is not correctly placed regarding the alphabetical order.
 Input
 Line 1: a series of letters, uppercase.
 Output
 Line 1: the first letter that does not respect the alphabetical order.
 Constraints
 There are always at least two letters and less than 26.
 The series may start and end anywhere in the alphabet.
 Some letters may be entirely missing, but the remaining ones will be in order - except one. There are no duplicate letters.
 There is always one and only one incorrectly placed letter.
 Example
 Input
 ABCDFEGH
 Output
 E

 MNOPQRTSUVWX
 S

 regular spacing:
 ACDEGHIJLNQRSUXZY
 Y
 irregular spacing
 CEGIMKO
 K

 */
 class alpha_out_of_order {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        char[] letters = w.toCharArray();
        int[] letterValue = new int[letters.length];

        for (int i = 0; i < letters.length; i++) {
            letterValue[i] = (int)(letters[i]);
        }
        for (int i = 0; i < letterValue.length - 1; i++) {
            if (letterValue[i+1] < letterValue[i]) {
                System.out.println((char)letterValue[i+1]);
                break;
            }
        }
//      can also use an arraylist:
//        ArrayList<Integer> letterVal = new ArrayList<Integer>();
//        for (int i = 0; i<w.length(); i++) {
//            letterVal.add((int)letters[i]);
//        }
//        for (int i = 0; i<letterVal.size()-1; i++) {
//            if (letterVal.get(i+1) < letterVal.get(i)) {
//                int value = letterVal.get(i+1);
//                System.out.println((char)value);
//                break;
//            }
//        }

    }
}
