package org.staticAnahtarKelimesi;

public class Seyirci {
    private String isim;
    public static int seyirci_sayisi = 0;

    public String getIsim() {
        return isim;

    }

    public void setIsim(String isim) {
        this.isim = isim;

    }

    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayisi++;
    }

    public void oyun_seyret() {
        System.out.println(isim + " oyun seyrediyor");
    }

    public static  int getSeyirci_sayisi() {
      //  System.out.println(isim);
        return seyirci_sayisi;
    }
}
