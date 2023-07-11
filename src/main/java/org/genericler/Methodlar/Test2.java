package org.genericler.Methodlar;

public class Test2 {
    public static void main(String[] args) {


        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
        Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);

        EsitAgirlik esitAgirlik1 = new EsitAgirlik(30, 20, 40, 2);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(40, 10, 50, 0);

        Sayisal sayisal_birincisi = birinciHesapla(sayisal1, sayisal2);
        System.out.println("Sayisal Birincisi ogrencinin puani : " + sayisal_birincisi.puanHesapla());
        EsitAgirlik esitAgirlik_birincisi = birinciHesapla(esitAgirlik1, esitAgirlik2);
        System.out.println("Esit Agirlik Birincisi ogrencinin puani : " + esitAgirlik_birincisi.puanHesapla());

    }

    public static <E extends Aday> E birinciHesapla(E e1, E e2) {
        if (e1.puanHesapla() > e2.puanHesapla()) return e1;
        else return e2;
    }

}
