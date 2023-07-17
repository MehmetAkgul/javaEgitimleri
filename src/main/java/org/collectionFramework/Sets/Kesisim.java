package org.collectionFramework.Sets;

import java.util.HashSet;
import java.util.Set;

public class Kesisim {
    public static void main(String[] args) {


        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();


        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("Php");

        set2.add("Go");
        set2.add("Java");
        set2.add("Css++");


        Set<String> kesisim = new HashSet<String>(set2);
        System.out.println(kesisim.retainAll(set1));

           System.out.println(kesisim);





}
}
