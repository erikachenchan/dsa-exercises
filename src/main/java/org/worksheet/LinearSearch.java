package org.worksheet;

import java.util.Arrays;

public class LinearSearch {

    //Linear search is a search algorithm that searches for information in an array by going through
    // every value in the array one by one. When the value that was searched for is found,
    // its index is immediately returned. If the requested value cannot be found,
    // linear search returns the information that the value was not found
    // — typically this means returning -1 instead of a valid index.
    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] myArray = {4, 5, 6, 1, 7, 9};
        int valueToSearch = 9;
//        System.out.println(linearSearch(myArray, valueToSearch));
        System.out.println("");

        System.out.println(Arrays.toString(myArray));
        int index = linearSearch(myArray, valueToSearch);
        if (index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found in the array");
        }

    }
}

