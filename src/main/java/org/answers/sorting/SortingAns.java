package org.answers.sorting;

import java.util.Arrays;

/**
 * This exercises covers about Sorting numbers, from smallest to biggest
 * */
public class SortingAns {
    public static int smallest(int[] array) {

        // initializes an integer var called smallest, with the value of the first element of the array
        // In other words, smallest will now hold the value of the first element in the array.
        int smallest = array[0];

        // for loop to iterate through all elements in the array.  the [i < array.length] is the loop condition and
        // will continue to loop as long as the value i is less than the length of the array
        for (int i = 1; i < array.length; i++) {
            // checks whether the current element at index i in the array is smaller than the current value of the smallest variable
            if (array[i] < smallest) {
                //  updates the value of the smallest variable with the value of the current element in the array.
                //  This ensures that smallest always contains the smallest value encountered during the iteration
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int biggest(int[] array) {
        int biggest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        return biggest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;

    }

    public static int indexOfBiggest(int[] array) {
        int biggest = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestForm(int[] array, int startIndex) {
        int index = startIndex;
        int smallest = array[index];

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void main(String[] args) {
//        int[] numbers = {1, 5, 8, 77, 20};
//        System.out.println("Smallest: " + smallest(numbers));
//        System.out.println("Biggest: " + biggest(numbers));
//
//        // part 2
//        System.out.println("");
//        System.out.println("Index of the smallest number " + smallest(numbers) + " is : " + indexOfSmallest(numbers));
//        System.out.println("Index of the biggest number " + biggest(numbers) + " is : " + indexOfBiggest(numbers));
//
//        // part 3
//        System.out.println("");
//        System.out.println("The following array list are: {-1, 6, 9, 8, 12}");
//        int[] numberList = {-1, 6, 9, 8, 12};
//        System.out.println(indexOfSmallestForm(numberList, 2));
//        System.out.println(indexOfSmallestForm(numberList, 3));
//        System.out.println(indexOfSmallestForm(numberList, 4));

        // part 4
        int[] number = {3, 2, 5, 4, 8};

        System.out.println("Printing numbers");
        System.out.println(Arrays.toString(number));
        System.out.println("");
        System.out.println("Swapping Index 1 and 2");
        swap(number, 1, 0);
        System.out.println(Arrays.toString(number));
        System.out.println("");
        System.out.println("Swapping Index 0 and 3");
        swap(number, 0, 3);
        System.out.println(Arrays.toString(number));

    }

}
