package org.ornekler.calisanlarProjesi;

public class Yonetici extends Calisan {

    private int sorumlu_kisi;


    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi = sorumlu_kisi;

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yoneticini Sorlum oldugu kisi sayisi");
    }

    public void zamYap(int miktar) {
        System.out.println(getAd() + "  calisanlara " + miktar + " kadar zam yapiyor....");
    }
}
