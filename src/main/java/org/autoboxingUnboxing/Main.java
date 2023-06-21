package org.autoboxingUnboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        // ArrayList<int> arrayList2 = new ArrayList<int>(); // int seklinde ilkel bir tip veri gonderilemez referans gonderilmesi lazim

        //Wrapper Class lar kullanabiliriz
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        Integer a = 5; // buda bir wrapper class tir

        for (int i = 0; i < 10; i++) {
            arrayList2.add(Integer.valueOf(i * 4));// AutoBoxing kullanimi
        }


        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i).intValue());// bunada UnBoxing islemi denir
        }


        for (int i = 0; i < 10; i++) {
            arrayList2.add(i * 4);// burda Integer.valueOf(i * 4) islemini kendi yapiyor
        }


        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i));// burda da  arrayList2.get(i).intValue() islemini kendi yapiyor
        }

    }


}
