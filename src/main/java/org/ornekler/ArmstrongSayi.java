package org.ornekler;

public class ArmstrongSayi {
    public static void main(String[] args) {
        // girilan bir sayinin amrstrong sayi olabilmesi icin
        // her bir her bir basamaginin sayi degirinin girilen sanyinin sayi karakteri kadar ustlerinin toplami
        // eger o sayiya esit ise o bir armstrog sayidir
        // 1634 = 1ˆ4+ 6ˆ4+3ˆ4+4ˆ4 ise bu bir armstrong sayidir

        int sayi = 1634;
        int n = 4;
        int toplam = 0;
        int gecici_sayi = sayi;
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            toplam += Math.pow(basamak_degeri,n);
        } while (gecici_sayi > 0);
        if (toplam == sayi) {
            System.out.println("bu bir armstrong sayidir");
        }
    }
}
