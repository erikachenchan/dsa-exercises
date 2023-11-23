package org.answers.readymadealgo;

import java.util.ArrayList;

public class SortListStrings {

    public static void sortStrings(ArrayList<String> strings) {

    }

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("olivia");
        nameList.add("brooke");
        nameList.add("hayley");
        nameList.add("kristina");
        nameList.add("Abby");

        System.out.println("ArrayList of names");
        System.out.println(nameList);
        sortStrings(nameList);
        System.out.println(nameList);
    }
}
