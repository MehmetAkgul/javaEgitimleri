package org.Map.HashMap;

import java.util.*;

public class LinkedHashMapVeTreeMap {
    public static void mapYazdir(Map<Integer, String> map) {
        map.put(0, "C#");
        map.put(3, "Java#");
        map.put(100, "Python");
        map.put(2, "Php");
        map.put(300, "C");

    /*    for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Anahtar : " + entry.getKey() + "  Value: " + entry.getValue());
        }*/

    /*    for ( Integer key : map.keySet()){
            System.out.println("Anahtar : " +key + "  Value: " + map.get(key));
        }*/

        Collection<String> values = map.values();

        for ( String s :values){
            System.out.println( "Value: " + s);
        }
    }

    public static void main(String[] args) {

        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashmap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        System.out.println("****************************");
        mapYazdir(hashmap);
        System.out.println("****************************");
        mapYazdir(linkedHashmap);
        System.out.println("****************************");
        mapYazdir(treeMap);
    }

}
