package org.exception.ThrowsAnahtarKelimesi;

import java.io.IOException;
import java.util.Scanner;

public class MekanKontrol2 {


    public static void mekanKontrol(int yas) throws IOException {
        if (yas < 18) {
            throw new IOException();
        } else
            System.out.println("Mekana Hosgeldiniz");
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi Giriniz :");
        int yas = scanner.nextInt();
        mekanKontrol(yas);
    }
}
