package org.interfaceSiniflar.ders1;

public class MakineMuhendisi implements IMuhendis, ICalisma  {

    private boolean aslerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean aslerlik, boolean adli_sicil) {
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
        if (array.length == 0)
            System.out.println("Herhangi bir tecrubem yoktur ");
        else {
            System.out.println("Makine muhendisi olarak Su sirketlerle calistim : ");
            for (String a : array)
                System.out.println(a);
        }
    }

    public void referansGetir(String[] array) {
        if (array.length == 0)
            System.out.println("Herhangi bir referansim bulunmuyor");
        else {
            System.out.println("Referanslarim : ");
            for (String a : array)
                System.out.println(a);
        }
    }

    @Override
    public void calis() {
        System.out.println("Makine Muhendisi Calisiyor");
    }
}
