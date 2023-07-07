package org.interfaceSiniflar;

public class Main {
    public static void main(String[] args) {
        PcMuhendisi pcMuhendisi = new PcMuhendisi(false, false);
        pcMuhendisi.adliSicilKaydi();
        pcMuhendisi.askerlikDurumuSorgula();
        String[] tecrube = {"a Firmasi ", "B firmasi "};
        pcMuhendisi.isTecrubesi(tecrube);
        System.out.println(pcMuhendisi.mezuniyetOrtalamasi(4.0));
        ;

        IMuhendis makineMuhendisi = new MakineMuhendisi(true, true);
        makineMuhendisi.adliSicilKaydi();
        makineMuhendisi.askerlikDurumuSorgula();
        String[] tecrube2 = {"a Firmasi ", "B firmasi "};
        makineMuhendisi.isTecrubesi(tecrube2);
        String[] referans = {"Mehmet Akgul", "Turkan Akgul"};
         ((MakineMuhendisi) makineMuhendisi).referansGetir(referans);
         ((MakineMuhendisi) makineMuhendisi).calis();
        System.out.println(makineMuhendisi.mezuniyetOrtalamasi(2.75));
        ;
    }
}
