package org.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Abone abone = new Abone();

        abone.isim="Mehmet";
        abone.sehir="Canakkale";
        abone.bakiye=200;
        abone.dogalgazKullan(200);

        System.out.println("********************* ");
        GelismisAbone abone1 = new GelismisAbone("Mehmet1", 500, "Canakkale");
        abone1.bakiyeOgren();
        abone1.dogalgazKullan(200);

    }
}
