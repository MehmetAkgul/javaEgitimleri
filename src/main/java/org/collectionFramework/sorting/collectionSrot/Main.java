package org.collectionFramework.sorting.collectionSrot;


import java.util.*;



public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }






    }
}