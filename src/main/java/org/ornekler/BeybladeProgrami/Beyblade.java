package org.ornekler.BeybladeProgrami;

public class Beyblade {

    private String beybladeci;
    private int donushizi;
    private int saldiriGucu;

    public Beyblade(String beybladeci, int donushizi, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donushizi = donushizi;
        this.saldiriGucu = saldiriGucu;
    }

    public void saldir() {
        System.out.println(beybladeci + " " + saldiriGucu + " ile saldiriyor ");
    }

    public void kutsalCanavarOrtayaCikar() {
        System.out.println("Bu beybladenin kutsal canavari bulunmuyor");
    }

    public void bilgileriGoster() {
        System.out.println("Beybladeci Ismi : " + beybladeci);
        System.out.println("Beybladeci Saldiri Gucu : " + saldiriGucu);
        System.out.println("Beybladeci Donus Hizi : " + donushizi);
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonushizi() {
        return donushizi;
    }

    public void setDonushizi(int donushizi) {
        this.donushizi = donushizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
}
