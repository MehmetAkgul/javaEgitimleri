package org.abstractSiniflar;

public class Main {
    public static void main(String[] args) {
        // Sekil sekil = new Sekil("Sekil")  ;

        Kare kare1 = new Kare("Kare1 ", 5);
        Daire daire1 = new Daire("Daire1 ", 3);

        Sekil sekil;
        sekil = new Kare("Kare2", 6);
        sekil.alanHesapla();
        //  sekil.cevreHersapla();

        kare1.alanHesapla();
        kare1.cevreHersapla();


        daire1.alanHesapla();
    }
}
