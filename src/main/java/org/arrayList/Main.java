package org.arrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("bir");
        arrayList.add("iki");
        arrayList.add("uc");
        arrayList.add("dort");
        arrayList.add("bes");

        System.out.println(arrayList.get(0));


        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
        System.out.println("--------- eleman silme ---------");
        arrayList.remove("iki");

        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("--------- elemanin index degerini alma ---------");

        System.out.println(arrayList.indexOf("uc"));
        System.out.println(arrayList.lastIndexOf("uc"));
        System.out.println(arrayList.indexOf("alti"));

        arrayList.set(3, "onbir");


        for (String s : arrayList) {
            System.out.println(s);
        }

        yazdir(arrayList);


    }

    public static void yazdir(ArrayList<String> arrayList) {
        System.out.println("------- array listleri yazdir----------");
        for (String a : arrayList) {
            System.out.println(a);
        }
    }
}
