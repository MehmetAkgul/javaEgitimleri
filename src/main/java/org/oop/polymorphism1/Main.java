package org.oop.polymorphism1;


class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konusuyor";
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavliyor";
    }
}

class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + " havliyor";
    }
}
class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }
    @Override
    public String konus() {
        return this.getIsim() + " kisniyor";
    }
}

public class Main {
    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }


    public static void main(String[] args) {
       /* Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabas");
        Hayvan hayvan3 = new At("Sahbatur");
        System.out.println( hayvan1.konus());
        System.out.println( hayvan2.konus());
        System.out.println( hayvan3.konus());
        */
       konustur(new Kedi("Boncuk"));
       konustur(new Kopek("Karabas"));
       konustur(new At("Sahbayir"));

    }
}
