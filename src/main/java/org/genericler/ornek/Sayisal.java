package org.genericler.ornek;



public class Sayisal extends Aday {

    public Sayisal(int turkce, int matamatik, int edebiyat, int fizik, String isim) {
        super(turkce, matamatik, edebiyat, fizik, isim);
    }

    @Override
    int puanHesapla() {
        return getTurkce()*5 + getMatamatik() * 4 + getFizik()*4 + getEdebiyat()* 1;
    }

}
