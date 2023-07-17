package org.collectionFramework.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
    degerler anahtar (key) ve Value (deger) olarak depolar.
keyler unique dir.
     */

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(50, "Php");
        hashMap.put(20, "Php");
        //System.out.println(hashMap);

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Anahtar : " + entry.getKey() + "-----> Deger : " + entry.getValue());
        }
    }
}
