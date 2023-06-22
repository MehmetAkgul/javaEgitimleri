package org.list.linkedList2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void listeyiBastir(LinkedList<String> gidilecekYerler) {
        /*for (String yer : gidilecekYerler) {
            System.out.println(yer);
        }*/


        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void siraliEkle(LinkedList<String> gidilecekYerler2, String yeni) {


        ListIterator<String> iterator = gidilecekYerler2.listIterator();
        while (iterator.hasNext()) {
            int karsilastir = iterator.next().compareTo(yeni);// esitse 0 buyukse negatif bir sayi kucukse pozitif bir sayi donderiyor

        // System.out.println(yeni + "  ve deger " + karsilastir);
            if (karsilastir == 0) {
                System.out.println("listenizde bu eleman zaten var");
                return;
            } else if (karsilastir < 0) {
                //yeni deger iterator.next ten daha buyuk
            } else if (karsilastir > 0) {
                //yani yeni deger kucuk oldugundan bir geri gelip ekleme yapacagiz
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }

    public static void main(String[] args) {
        LinkedList<String> gidilecekYerler = new LinkedList<String>();
        LinkedList<String> gidilecekYerler2 = new LinkedList<String>();
        gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kutuphane");
        gidilecekYerler.add("Spor Salonu");
        gidilecekYerler.add("Ev");

        listeyiBastir(gidilecekYerler);


        System.out.println("-------------------------");

        gidilecekYerler.add(4, "Alisveris merkezi");
        listeyiBastir(gidilecekYerler);

        System.out.println("-------------------------");
        gidilecekYerler.remove(3);
        listeyiBastir(gidilecekYerler);

        System.out.println("-------------------------");

        siraliEkle(gidilecekYerler2, "Postane");
        siraliEkle(gidilecekYerler2, "Market");
        siraliEkle(gidilecekYerler2, "Ev");
        siraliEkle(gidilecekYerler2, "Okul");
        siraliEkle(gidilecekYerler2, "Kutuphane");
        siraliEkle(gidilecekYerler2, "Spor Salonu");
        listeyiBastir(gidilecekYerler2);
    }
}
