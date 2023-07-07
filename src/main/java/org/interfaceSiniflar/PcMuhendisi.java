package org.interfaceSiniflar;

public class PcMuhendisi implements IMuhendis{

    private boolean aslerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean aslerlik, boolean adli_sicil) {
        this.aslerlik = aslerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
        if (aslerlik)
            System.out.println("Askerligimi yaptim ");
        else
            System.out.println("Askerligimi henuz yapamdim ");
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam : " + derece;
    }

    @Override
    public void adliSicilKaydi() {
        if (adli_sicil)
            System.out.println("Adli Sicil kaydim bulunuyor");
        else
            System.out.println("Herhangi bir adli sicil kayfim bulunmuyor");
    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar muhendisi olarak Su sirketlerle calistim : ");
        for (String a : array)
            System.out.println(a);
    }


}
