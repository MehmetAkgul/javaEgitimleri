package org.exception.YurtDisiCikisProgramiException;


import java.util.Scanner;


class SiyasiException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Siyasi Yasaginiz Bulunuyor");
    }
}

class VizeException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Gideceginiz Ulkeye vizeniz yoktur ");
    }
}

class HarcException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Yurtdisi Harcini yatirmaniz lazim");
    }
}

public class Yolcu {

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

    public void yurtDisiHarciKontrol() throws HarcException {
        if (this.harc < 15) {
            throw new HarcException();
        } else {
            System.out.println("Yurtidisi Cikis harci islemi tamam");
        }
    }

    public void siyasiYasakKontrol() throws SiyasiException {
        if (this.siyasiYasak) {
            throw new SiyasiException();
        } else {

            System.out.println("Siyasi Yasaginiz bulunmuyor");
        }

    }

    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu) {
            System.out.println("Vizeniz Kontrolu tamam");
        } else {
            throw new VizeException();
        }

    }
}
