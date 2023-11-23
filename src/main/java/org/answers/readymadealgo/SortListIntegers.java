package org.answers.readymadealgo;

import java.util.ArrayList;
import java.util.Collections;

public class SortListIntegers {

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);
        numbers.add(-4);
        numbers.add(2);
        numbers.add(-9);

        System.out.println("ArrayList of numbers");
        // prints ArrayList of numbers before sorting it out
        System.out.println(numbers);
        sortIntegers(numbers);
        // after sorts
        System.out.println(numbers);

    }
}
