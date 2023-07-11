package org.genericler.Methodlar;

public abstract class Aday {
    private int turkce;
    private int matamatik;
    private int edebiyat;
    private int fizik;

    public Aday(int turkce, int matamatik, int edebiyat, int fizik) {
        this.turkce = turkce;
        this.matamatik = matamatik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
    }

    abstract int puanHesapla();


    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatamatik() {
        return matamatik;
    }

    public void setMatamatik(int matamatik) {
        this.matamatik = matamatik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }
}
