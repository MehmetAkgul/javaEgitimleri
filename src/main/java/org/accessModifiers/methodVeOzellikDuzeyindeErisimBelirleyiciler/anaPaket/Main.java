package org.accessModifiers.methodVeOzellikDuzeyindeErisimBelirleyiciler.anaPaket;

public class Main {
    /**
     * method ve ozellik duzeyinde erisim belirleyiciler
     * <p>
     * public > eger bir method veya ozellik (class member veya alan) public olarak tanimlanmissa
     * bu alana paketin icindeki ve disindaki tum classlar erisebilir
     * <p>
     * default > Eger bir method veya ozellik tanimlanirken hicbir eirim belirleyici kullanilmamissa (default)
     * bu alana sadece kendi paketindeki classlar erisebilir
     * <p>
     * protected >  Eger bir method veya ozellik (class member veya alan ) public olarak tanimlanmissa
     * bu alana ayni paketin icindeki diger classlar tarafinda erisebilir. Paketin disindaki classlar ise sadece bu alanin bulundugu classin bir alt classiyla erisebilir
     * <p>
     * private > Eger bir alan private olarak tanimlanmis ise bu alana sadece kendi class i erisebilir.
     */
    public static void main(String[] args) {
        Araba araba = new Araba();
        System.out.println(araba.model);
        System.out.println(araba.renk);
        System.out.println(araba.yil);
        // System.out.println(araba.km);


        Hayvan hayvan = new Hayvan("Boncuk");
        System.out.println(hayvan.isim);
    }
}
