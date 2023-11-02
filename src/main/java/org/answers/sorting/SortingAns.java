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

    public static void main(String[] args) {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + smallest(numbers));
    }

}
