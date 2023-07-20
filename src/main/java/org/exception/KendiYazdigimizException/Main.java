package org.exception.KendiYazdigimizException;

import java.util.Scanner;

public class Main {
    public static void yasKontrol(int yas) {
        if (yas < 18)
            throw new InvalidAgeException("Invalid Age");
        else
            System.out.println("Mekana Hosgeldiniz");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi Giriniz :");
        int yas = scanner.nextInt();
       try {
           yasKontrol(yas);
       }catch (InvalidAgeException e)
       {
           System.out.println(e.getMessage());
       }
    }
}
