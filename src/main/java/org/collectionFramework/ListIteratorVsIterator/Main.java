package org.collectionFramework.ListIteratorVsIterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();

        List<String> list = new ArrayList<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");
        set.add("Php");

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        list.add("Php");

        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list.listIterator();
        System.out.println("**************************** set **************");

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("******************************list ************");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("******************************list ************");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
