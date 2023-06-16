package org.oop.polymorphism2;


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

class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havliyor";
    }
}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kisniyor";
    }
}
class Kus extends Hayvan {

    public Kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " otuyor";
    }
}

public class Main {
    public static void konustur(Object object) {

        if (object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());
        } else if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        } else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());
        }else if (object instanceof At) {
            Kus kus = (Kus) object;
            System.out.println(kus.konus());
        } else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        }


        //System.out.println(object.konus());
    }


    public static void main(String[] args) {
       /* Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabas");
        Hayvan hayvan3 = new At("Sahbatur");
        System.out.println( hayvan1.konus());
        System.out.println( hayvan2.konus());
        System.out.println( hayvan3.konus());
        */



/*

 Kopek kopek = new Kopek("Karabas");
        if (kopek instanceof Hayvan) {
            System.out.println("Bu nesne Hayvan Sinifindan dir ");
        }
        if (kopek instanceof Kopek) {
            System.out.println("Bu nesne Kopek Sinifindan dir ");
        }
        */

        Kopek kopek = new Kopek("Karabas");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("Sahbayir");
        Hayvan hayvan = new Hayvan("Limon");
        Kus kus = new Kus("Zeytin");

        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kus);

    }
}
