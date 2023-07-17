package org.collectionFramework.VektorVeStack.Vektor;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // treat larda guvenlidir ama arraylistlerden yavastir


        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");

       /* for (String s : vector) {
            System.out.println(s);
        }*/


      /*
      ListIterator<String> listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }*/
/*

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());
*/

        System.out.println("Ilk Eleman : " + vector.firstElement());
        System.out.println("Son Eleman : " + vector.lastElement());
    }
}
