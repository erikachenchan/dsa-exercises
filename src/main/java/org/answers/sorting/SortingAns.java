package org.answers.sorting;

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

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 77, 20};
        System.out.println("Smallest: " + smallest(numbers));
        System.out.println("Biggest: " + biggest(numbers));

        System.out.println("");
        System.out.println("Index of the smallest number " + smallest(numbers) + " is : " + indexOfSmallest(numbers));
        System.out.println("Index of the biggest number " + biggest(numbers) + " is : " + indexOfBiggest(numbers));

    }

}
