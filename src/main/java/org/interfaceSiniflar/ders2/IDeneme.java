package org.interfaceSiniflar.ders2;

public interface IDeneme {

    //private int a = 4; private laan olusturamaz sin
    public int a = 4;


    // public int b ;// deger atamak zorundasin cunku getter setter yok

    static String deneme = "deneme";
    public final int c = 6;
    //public final int c ;
    // constuructor olmadigi icin ozelliklerin degerlerini vermemiz lazim yoksa hata veriyor


    public static void denemeMethod(){
        System.out.println("ben bir interface icinde govdesi olan static methodum ");

    }

}
