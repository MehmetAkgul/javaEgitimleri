package org.variables;

public class StringVariable {

    public static void main(String[] args) {

        String a = "Java ";
        String b = "Programala ";
        String c = "Dili";
        String toplam = a + b + c;
        System.out.println("toplam: " + toplam);

        int d = 35;
        String e = "Merhaba";
        String f = e + d;
        String g = d + e;

        System.out.println(f);
        System.out.println(g);


        char h = '?';

        String i = "merhaba" + h;

        System.out.println(i);

        //   \t -> bir tab kadar bosluk birakir
        //   \n -> yeni bir satira gecer 

        System.out.println("Merhaba\thosgeldiniz");
        System.out.println("Merhaba\nhosgeldiniz");

    }
}
