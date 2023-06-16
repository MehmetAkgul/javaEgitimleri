package org.ornekler.BeybladeProgrami;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("Cikis icin q'a basin. ");

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("hangi Beyblade uretmek istiyorsunuz?");
            String isim = scanner.nextLine();

            if (isim.equals("q")) {
                System.out.println("Programdan Cikiliyor...");
                break;
            } else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(isim);

                if (beyblade == null) {
                    System.out.println("Lutfen gecerli bir Beyblade ismi giriniz ");
                } else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }

        }

    }
}
