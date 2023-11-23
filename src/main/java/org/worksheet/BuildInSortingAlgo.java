package org.worksheet;

import java.util.Arrays;

public class BuildInSortingAlgo {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        // prints the final out of sorted arrays
        System.out.println(Arrays.toString(numbers));
    }
}
