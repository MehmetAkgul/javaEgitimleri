package org.genericler.ornek;



public class EsitAgirlik extends Aday {


    public EsitAgirlik(int turkce, int matamatik, int edebiyat, int fizik, String isim) {
        super(turkce, matamatik, edebiyat, fizik, isim);
    }

    @Override
    int puanHesapla() {
        return getTurkce() * 5 + getMatamatik() * 4 + getFizik() * 1 + getEdebiyat() * 4;
    }

}
