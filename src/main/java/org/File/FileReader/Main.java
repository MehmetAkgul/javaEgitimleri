package org.File.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))) {

            int i = 1;
            while (scanner.hasNextLine()) {
                System.out.println(i + ".satir : " + scanner.nextLine());
                i++;
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        }



    }
}
