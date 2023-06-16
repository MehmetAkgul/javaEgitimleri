package org.ornekler.BeybladeProgrami;

public class Dragon extends Beyblade{

    public String kutsalCanavar;
    public String gizliYetenek;


    public Dragon(String beybladeci, int donushizi, int saldiriGucu, String kutsalCanavar,String gizliYetenek) {
        super(beybladeci, donushizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi : "+ kutsalCanavar);
        System.out.println("Gizli yetenek  : "+ gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+ " "+ kutsalCanavar +" orataya cikariyor");
        System.out.println(getBeybladeci() + "'in kutsal saldirisi : Hayalet Kasirgasi");
    }
}
