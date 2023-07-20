package org.File.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            // fileWriter = new FileWriter("notlar.txt");// dosya var olsa bile yeni dosya olusturularak acilir
            fileWriter = new FileWriter("notlar.txt", true);// dosya var ise sonundan acilir

            fileWriter.write("Mehmet Akgul \n");
            fileWriter.write("Turkan Akgul \n");
            fileWriter.write("Ayse Nilda Akgul \n");
            fileWriter.write("Mustafa Eymen Akgul \n");


        } catch (IOException e) {
            System.out.println("Dosya Acilirken IOException olustu");
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
