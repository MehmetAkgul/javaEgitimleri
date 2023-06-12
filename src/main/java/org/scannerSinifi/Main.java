package org.scannerSinifi;

 import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas=scanner.nextInt();
        System.out.println("Yasiniz :"+ yas);
    }
}

