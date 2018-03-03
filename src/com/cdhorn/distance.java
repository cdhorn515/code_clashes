package com.cdhorn;

import java.util.*;

/**
 * INPUT:
 Line 1: N an integer for the number of items to sort.
 Next N lines: A unique word item and a number distance to one decimal place, separated by a space.

 OUTPUT:
 One line containing the N item words sorted by their distance in descending order, separated by spaces.

 CONSTRAINTS:
 0 < N < 100
 0.0 < distance < 100.0

 EXAMPLE:
 Input
 3
 tree 1.0
 mountain 2.0
 person 0.5
 Output
 mountain tree person
 */

 class distance_to_camera {
    public static void main(String args[]) {
        System.out.println("Enter an integer, and that many items with a decimal number between 0.0 and 100.0: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        HashMap<Float, String> myMap = new HashMap();
        List<Float> miles = new ArrayList<Float>();
        for (int i = 0; i < N; i++) {
            String item = in.next();
            float distance = in.nextFloat();
            myMap.put(distance, item);
            miles.add(distance);
        }

        Collections.sort(miles, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            float getFloat = miles.get(i);
            System.out.print(myMap.get(getFloat) + " ");
        }
    }
}
