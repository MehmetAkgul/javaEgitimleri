package org.ornekler.OOPileATMProjesi;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap) {

        Scanner scanner = new Scanner(System.in);

        String kullanici_adi;
        String parola;

        System.out.print("Kullanici Adi : ");
        kullanici_adi = scanner.nextLine();

        System.out.print("Parola : ");
        parola = scanner.nextLine();

        return hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola);

    }
}
