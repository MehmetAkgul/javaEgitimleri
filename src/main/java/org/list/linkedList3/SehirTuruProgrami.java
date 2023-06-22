package org.list.linkedList3;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class SehirTuruProgrami {

    public static void sehileriTurla(LinkedList<String> sehirler) {

        ListIterator<String> iterator = sehirler.listIterator();
        int islem;
        islemleriBastir();

        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()) {
            System.out.println("Herhangi Bir sehir bulunmuyor...");
        }
        boolean cikis = false;
        boolean ileri = true;

        while (!cikis) {
            System.out.println("Bir islem seciniz: ");
            islem = scanner.nextInt();
            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:

                    if (!ileri) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Sehre gidiliyor : " + iterator.next());
                    } else {
                        System.out.println("Gidilecek sehir kalmadi...");
                        ileri = true;
                    }
                    break;
                case 2:

                    if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Sehre gidiliyor : " + iterator.previous());
                    } else {
                        System.out.println("Sehir turu basladi");
                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("Programdan Cikiliyor");
                    break;


            }


        }
    }

    private static void islemleriBastir() {
        System.out.println("0 - Islemleri Goruntule....");
        System.out.println("1 - Bir Sonraki Sehre Git....");
        System.out.println("2 - Bir Onceki Sehre Git....");
        System.out.println("3 - Uygulamdan Cik....");
    }

    public static void main(String[] args) {

        LinkedList<String> sehiler = new LinkedList<String>();
        sehiler.add("Ankara");
        sehiler.add("Eskisehir");
        sehiler.add("Afyon");
        sehileriTurla(sehiler);

    }
}
