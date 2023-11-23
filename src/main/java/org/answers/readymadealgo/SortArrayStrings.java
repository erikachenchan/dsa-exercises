package org.answers.readymadealgo;

import java.util.Arrays;

public class SortArrayStrings {

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        System.out.println("Array of Strings");
        String[] arrayString = {"nami", "chopper", "brooke", "zoro", "luffy", "usopp", "franky", "robin"};
        System.out.println(Arrays.toString(arrayString));
        sort(arrayString);
        System.out.println(Arrays.toString(arrayString));
    }

}
