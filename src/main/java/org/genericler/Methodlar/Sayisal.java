package org.genericler.Methodlar;

public class Sayisal extends Aday{
    public Sayisal(int turkce, int matamatik, int edebiyat, int fizik) {
        super(turkce, matamatik, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {
        return getTurkce()*5 + getMatamatik() * 4 + getFizik()*4 + getEdebiyat()* 1;
    }

}
