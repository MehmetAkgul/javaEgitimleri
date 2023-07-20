package org.exception.ThrowsAnahtarKelimesi;

import java.io.IOException;
import java.util.Scanner;

public class MekanKontrol {


    public static void mekanKontrol(int yas) throws IOException {
        if (yas < 18) {
            throw new IOException();
        } else
            System.out.println("Mekana Hosgeldiniz");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi Giriniz :");
        int yas = scanner.nextInt();
        try {
            mekanKontrol(yas);
        } catch (IOException ex) {
            System.out.println("IOException olustu...");
        }
    }
}
