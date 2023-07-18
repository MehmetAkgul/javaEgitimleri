package org.collectionFramework.Queue.QueneInterfacevePriorityQuenue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue< Integer> queue = new PriorityQueue<>();
        queue.offer(5);
        queue.offer(1);
        queue.offer(200);
        queue.offer(2);
        queue.offer(101);

         while (!queue.isEmpty()){
             System.out.println("Eleman Cikariliyor...:"+ queue.poll());
         }
    }
}
