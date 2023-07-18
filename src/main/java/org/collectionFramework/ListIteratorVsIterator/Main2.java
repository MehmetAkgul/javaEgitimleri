package org.collectionFramework.ListIteratorVsIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main2 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        list.add("Php");

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Listeyi tersten bastiralim ***************************");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("Go isimli elemani listiterator den silmek ***************************");

        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if (value.equals("Go"))
                listIterator.remove();

        }
        System.out.println("Listeyi yazdiralim ***************************");
        for (String s : list){
            System.out.println(s);
        }

    }
}
