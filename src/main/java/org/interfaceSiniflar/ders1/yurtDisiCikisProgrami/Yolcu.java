package org.interfaceSiniflar.ders1.yurtDisiCikisProgrami;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatirdiginiz harc bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Herhangi bir Siyasi yasaginiz bulunuyor mu?(Evet/Hayir)  : ");
        String cevap = scanner.nextLine();
        this.siyasiYasak = cevap.equals("Evet");
        System.out.println("Vizeniz bulunuyor mu?(Evet/Hayir)  : ");
        String cevap2 = scanner.nextLine();
        this.vizeDurumu = cevap2.equals("Evet");
    }

    @Override
    public boolean yurtDisiHarciKontrol() {
        if (this.harc < 15) {
            System.out.println("Yurtidisi Cikis harcini tam yatirin");
            return false;
        } else {
            System.out.println("Yurtidisi Cikis harci islemi tamam");
        }
        return true;
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak) {
            System.out.println("Siyasi yasasginiz bulunuyor. Yurtdisina Cikamazmisiniz...");
            return false;
        } else {
            System.out.println("Siyasi Yasaginiz bulunmuyor");
            return true;
        }

    }


    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu) {
            System.out.println("Vize islemleri Tamam");
            return true;
        } else {
            System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktadir...");
            return false;
        }

    }
}
