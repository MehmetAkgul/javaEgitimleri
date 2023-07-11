package org.genericler.ornek;

public abstract class Aday {
    private int turkce;
    private int matamatik;
    private int edebiyat;
    private int fizik;
    private String isim;

    public Aday(int turkce, int matamatik, int edebiyat, int fizik, String isim) {
        this.turkce = turkce;
        this.matamatik = matamatik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
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
