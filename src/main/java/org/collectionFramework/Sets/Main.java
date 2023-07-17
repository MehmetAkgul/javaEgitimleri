package org.collectionFramework.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*
        Set Interface -----> HashSet,LinkedHashSet, TreeSet

        Set Interface ile List Interface'in farki
        List Interface'i implement eden classlar bir elementten birden fazla depolayabilirken
        Set Interface'i implement eden classlar bir elementten sadece bir tane depolayabilirler

        HashSet Sinifi

         */

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

//HashSet
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("Php");
// LinkedHashSet
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("Php");
// TreeSet
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("Php");
 /*

        System.out.println("HashSet *******************");
        for (String s : set1)
            System.out.println(s);
        System.out.println("LinkedHashSet *******************");
        for (String s : set2)
            System.out.println(s);
        System.out.println("TreeSet *******************");
        for (String s : set3)
            System.out.println(s);



  */

        System.out.println(set1.contains("Go"));
        System.out.println(set1.contains("Java"));
        System.out.println(set1.isEmpty());
        set1.remove("Java");
        System.out.println("HashSet *******************");
        for (String s : set1)
            System.out.println(s);
    }
}
