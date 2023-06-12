package org.methodlar;


import java.util.Scanner;

public class HesapMakinesi {

    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int toplama(int a, int b, int c, int d) {
        return (a + b + c + d);
    }

    public static int carpma(int a, int b) {
        return (a * b);
    }

    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }

    public static double bolme(int a, int b) {
        return ((double) a / b);
    }

    public static void main(String[] args) {
        String islemler = "  ------------------ \n"
                + " 1. Toplama Islemi \n"
                + " 2. Cikarma Islemi \n"
                + " 3. Carpma Islemi \n"
                + " 4. Bolme Islemi \n"
                + " 5. Cikis \n"
                + "  ------------------ \n";
        int sonuc;
        int kacsayi;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(islemler);
            System.out.print("Islemi Seciniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("5")) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Kac deger toplayacaksiniz 2 ,3 ,4  : ");
                kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.print("Birinci saiyiyi giriniz : ");
                    int a = scanner.nextInt();
                    System.out.print("Ikinci saiyiyi giriniz : ");
                    int b = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println(a + "+" + b + "=" + toplama(a, b));
                    System.out.println("Devam etmek icin bir tusa basin");
                    scanner.nextLine();

                } else if (kacsayi == 3) {
                    System.out.print("Birinci saiyiyi giriniz : ");
                    int a = scanner.nextInt();
                    System.out.print("Ikinci saiyiyi giriniz : ");
                    int b = scanner.nextInt();
                    System.out.print("Ucuncu saiyiyi giriniz : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(a + "+" + b + "+" + c + "=" + toplama(a, b, c));
                    System.out.println("Devam etmek icin bir tusa basin");
                    scanner.nextLine();

                } else if (kacsayi == 4) {
                    System.out.print("Birinci saiyiyi giriniz : ");
                    int a = scanner.nextInt();
                    System.out.print("Ikinci saiyiyi giriniz : ");
                    int b = scanner.nextInt();
                    System.out.print("Ucuncu saiyiyi giriniz : ");
                    int c = scanner.nextInt();
                    System.out.print("Ucuncu saiyiyi giriniz : ");
                    int d = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + toplama(a, b, c, d));
                    System.out.println("Devam etmek icin bir tusa basin");
                    scanner.nextLine();
                }
            } else if (islem.equals("2")) {

                System.out.print("Birinci saiyiyi giriniz : ");
                int a = scanner.nextInt();
                System.out.print("Ikinci saiyiyi giriniz : ");
                int b = scanner.nextInt();

                scanner.nextLine();
                System.out.println(a + "-" + b + "=" + cikarma(a, b));
                System.out.println("Devam etmek icin bir tusa basin");
                scanner.nextLine();
            } else if (islem.equals("3")) {

                System.out.print("Kac deger carpacaksiniz 2 ,3   : ");
                kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.print("Birinci saiyiyi giriniz : ");
                    int a = scanner.nextInt();
                    System.out.print("Ikinci saiyiyi giriniz : ");
                    int b = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println(a + "*" + b + "=" + carpma(a, b));
                    System.out.println("Devam etmek icin bir tusa basin");
                    scanner.nextLine();
                } else if (kacsayi == 3) {
                    System.out.print("Birinci saiyiyi giriniz : ");
                    int a = scanner.nextInt();
                    System.out.print("Ikinci saiyiyi giriniz : ");
                    int b = scanner.nextInt();
                    System.out.print("Ucuncu saiyiyi giriniz : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(a + "*" + b + "*" + c + "=" + carpma(a, b, c));
                    System.out.println("Devam etmek icin bir tusa basin");
                    scanner.nextLine();

                } else {
                    System.out.println("Boyle bir secenek mevcut degil");
                }
            } else if (islem.equals("4")) {

                System.out.print("Birinci saiyiyi giriniz : ");
                int a = scanner.nextInt();
                System.out.print("Ikinci saiyiyi giriniz : ");
                int b = scanner.nextInt();

                scanner.nextLine();
                System.out.println(a + "/" + b + "=" + bolme(a, b));
                System.out.println("Devam etmek icin bir tusa basin");
                scanner.nextLine();
            }
        }
    }
}


