package org.list.linkedList1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> diller = new ArrayList<String>();
        diller.add("Java");
        diller.add("Php");
        diller.add("Python");
        diller.add("Kotlin");
        diller.add("C#");
        for (String dil : diller) {
            System.out.println(dil);
        }
        System.out.println("---------------------------");
        diller.add(1, "C++");
        for (String dil : diller) {
            System.out.println(dil);
        }
    }
}
