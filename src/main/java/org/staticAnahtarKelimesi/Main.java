package org.staticAnahtarKelimesi;

public class Main {
    public static void main(String[] args) {
        Seyirci seyirci = new Seyirci("Mehmet");
        Seyirci seyirci2 = new Seyirci("Turkan");

        seyirci.oyun_seyret();
        System.out.println("Seyirci sayisi : " + Seyirci.getSeyirci_sayisi());
        System.out.println("Seyirci sayisi : " + seyirci.getSeyirci_sayisi());
        System.out.println("Seyirci sayisi : " + seyirci2.getSeyirci_sayisi());

        //selamla();
        selamla2();
    }

    public void selamla() {
        System.out.println("Selamlar....");
    }

    public static void selamla2() {
        System.out.println("Selamlar....");
    }
}
