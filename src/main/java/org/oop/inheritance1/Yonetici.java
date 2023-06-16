package org.oop.inheritance1;

public class Yonetici extends Calisan {

    private int sorumluKisi;

    public Yonetici(String isim, int maas, String departman, int sorumluKisi) {
        super(isim, maas, departman);
        this.sorumluKisi = sorumluKisi;
    }
    public void bilgileriGoster() {
     /*   System.out.println("Isim :" + getIsim());
        System.out.println("Maas :" + getMaas());
        System.out.println("Departman :" + getDepartman());*/
        super.bilgileriGoster();
        System.out.println("Sorumlu Kisi :" + sorumluKisi);
    }

    public void zamYap(int miktar) {
        System.out.println("Calisanlara "+miktar+" TL zam yapildi");
    }
}
