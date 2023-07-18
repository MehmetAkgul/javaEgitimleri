package org.collectionFramework.Queue.QueneInterfacevePriorityQuenue.AcilServisUygulamasi;

public class Hasta implements Comparable<Hasta> {
    private String isim;
    private String sikayet;
    private int oncelik;

    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;
        if (sikayet.equals("Apandisit")) this.oncelik = 1;
        else if (sikayet.equals("Yanik")) this.oncelik = 2;
        else this.oncelik = 3;
    }

    @Override
    public String toString() {
        return "Hasta{" + "isim='" + isim + '\'' + ", sikayet='" + sikayet + '\'' + ", oncelik=" + oncelik + '}';
    }

    @Override
    public int compareTo(Hasta hasta) {
        return Integer.compare(this.oncelik, hasta.oncelik);
    }
}
