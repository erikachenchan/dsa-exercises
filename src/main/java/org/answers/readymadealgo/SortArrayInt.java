package org.answers.readymadealgo;

import java.util.Arrays;

public class SortArrayInt {

    public static void sort(int[] array) {
        Arrays.sort(array);

    }

    public static void main(String[] args) {
        System.out.println("Array of integers");
        int[] array = {3, 1, 5, 99, 3, 12};
        //prints array of integers before sorting it out.
        System.out.println(Arrays.toString(array));
        sort(array);
        //prints array of integers after sorting it out.
        System.out.println(Arrays.toString(array));

    }
}
