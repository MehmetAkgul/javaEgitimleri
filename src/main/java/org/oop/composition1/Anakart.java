package org.oop.composition1;

public class Anakart {

    private String model;
    private String uretici;
    private int yuva_sayisi;
    private String islemtim_sistemi;

    public Anakart(String model, String uretici, int yuva_sayisi, String islemtim_sistemi) {

        this.model = model;
        this.uretici = uretici;
        this.yuva_sayisi = yuva_sayisi;
        this.islemtim_sistemi = islemtim_sistemi;


    }


    public void islemtim_sistemi_yukle(String islemtim_sistemi) {
        this.islemtim_sistemi = islemtim_sistemi;

        System.out.println("islemtim sistemi yuklendi... " + islemtim_sistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getIslemtim_sistemi() {
        return islemtim_sistemi;
    }

    public void setIslemtim_sistemi(String islemtim_sistemi) {
        this.islemtim_sistemi = islemtim_sistemi;
    }
}
