package org.ornekler.BeybladeProgrami;

public class Drayga extends Beyblade {


    public String kutsalCanavar;


    public Drayga(String beybladeci, int donushizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donushizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi : "+ kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+ " "+ kutsalCanavar +" orataya cikariyor");
        System.out.println(getBeybladeci() + "'in kutsal saldirisi : Kaplan Pencesi");
    }


}
