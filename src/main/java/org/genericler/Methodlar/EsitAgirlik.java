package org.genericler.Methodlar;

public class EsitAgirlik extends Aday {
    public EsitAgirlik(int turkce, int matamatik, int edebiyat, int fizik) {
        super(turkce, matamatik, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {
        return getTurkce() * 5 + getMatamatik() * 4 + getFizik() * 1 + getEdebiyat() * 4;
    }

}
