package org.collectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    /*
    Quene (Kuyruk) interface implemente eden linkedlist classi fifo first in first out mantigiyla calisir.
    add --> elemani kuyruga ekler ekleyemez ise hata firlatir
    offer-->elemani kuyruga ekler eklerse true doner ekleyemez ise false doner
    remove -> kuyrugun en basindaki elemani cikarir kuyruk bos ise hata firlatir
    poll --> kuyrugun en basindaki elemani cikarir  kuyruk bos ise null referans doner
    element --> kuyrugun en basindak elamani doner kuyruk bossa hata firlatir
    peek---> kuyrugun en basindaki elemani doner kuyruk bossa null eleman doner
     */
    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");

      /*  System.out.println("Ilk Eleman : "+queue.peek());
        System.out.println("Ilk Eleman cikar  : "+queue.poll());
        System.out.println("Ilk Eleman : "+queue.peek());*/

        while (!queue.isEmpty()){
            System.out.println(" Eleman cikariliyor   : "+queue.poll());
        }

    }

}