package org.collectionFramework.Sets;

import java.util.HashSet;
import java.util.Set;

public class FarkKumesi {
    public static void main(String[] args) {


        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();


        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("Php");

        set2.add("Go");
        set2.add("Java");
        set2.add("Css++");


        Set<String> fark = new HashSet<>(set2);
        System.out.println(fark.removeAll(set1));

                System.out.println(fark);


    }
}
