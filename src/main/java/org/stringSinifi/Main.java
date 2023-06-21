package org.stringSinifi;

public class Main {
    public static void main(String[] args) {

        String a = "Mehmet";
        String b = new String("Turkan");
        System.out.println(b);
        System.out.println("Harf Sayisi: " + b.length());
        System.out.println("0.indeks: " + b.charAt(0));
        System.out.println("2.indeks: " + b.charAt(2));
        System.out.println("son eleman: " + b.charAt(b.length() - 1));

        for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }

        System.out.println(b.startsWith("Tu"));
        System.out.println(b.endsWith("an"));

        System.out.println(b.indexOf('a'));
        System.out.println(b.indexOf('a'));
        System.out.println(a.lastIndexOf('e'));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        String c = "1923";

        int d = Integer.parseInt(c);
        System.out.println(d);
        int e = 1923;
        String f = String.valueOf(e);
        System.out.println(f);


        String a1 = "Mehmet";
        String a2 = "Mehmet";
        String a3 = new String("Mehmet");


        // ---------- bu kullanimda referanslar ayni mi --------------
        if (a1 == a2) {
            System.out.println("Esitler");

        } else {
            System.out.println("Esit degiller ");
        }

        if (a1 == a3) {
            System.out.println("Esitler");

        } else {
            System.out.println("Esit degiller ");
        }

        // ---------- bu kullanimda icerikleri  ayni mi --------------
        if (a1.equals(a3)) {
            System.out.println("Esitler");

        } else {
            System.out.println("Esit degiller ");
        }
    }
}
