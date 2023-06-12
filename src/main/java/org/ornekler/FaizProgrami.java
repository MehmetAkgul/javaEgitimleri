package org.ornekler;

import java.util.Scanner;

public class FaizProgrami {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int anapara,vade;


        System.out.println("Yatirmak istediginiz tutar : ");
        anapara =scanner.nextInt();
        System.out.println(" Paranizi kac yil vadeli yatirmak istiyorsunuz ?");

        vade = scanner.nextInt();

        double toplampara= anapara;
        double faizOrani=0.06;


        for (int i = 0; i <=vade; i++) {
            toplampara = (toplampara *faizOrani)+ toplampara;
            System.out.println(i+". yilin sonunda toplam para : " + (int)toplampara);
        }

    }
}
