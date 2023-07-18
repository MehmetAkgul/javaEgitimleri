package org.collectionFramework.Queue.QueneInterfacevePriorityQuenue.AcilServisUygulamasi;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Hasta> acil_servis = new PriorityQueue<>();

        acil_servis.offer(new Hasta("X Bey", "Yanik"));
        acil_servis.offer(new Hasta("Y Bey", "Apandisit"));
        acil_servis.offer(new Hasta("Z Bey", "Bas Agrisi"));
        acil_servis.offer(new Hasta("K Bey", "Apandisit"));
        acil_servis.offer(new Hasta("kl hanim", "Bas Agrisi"));
        acil_servis.offer(new Hasta("xz hanim", "Apandisit"));
        acil_servis.offer(new Hasta("yy hanim", "Yanik"));


        int i = 1;
        while (!acil_servis.isEmpty()) {
            System.out.println("*************");
            System.out.println(i + " . sirada");
            System.out.println(acil_servis.poll());
            System.out.println("*************");
            i++;
        }
    }
}
