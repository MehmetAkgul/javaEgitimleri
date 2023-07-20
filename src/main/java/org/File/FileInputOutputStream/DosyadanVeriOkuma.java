package org.File.FileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DosyadanVeriOkuma {
    public static void main(String[] args) {


        FileInputStream fis = null;


        try {
            //------------dosyayi acalim -------------
            fis = new FileInputStream("dosya2.txt");

            //------------dosyayi okuyalim -------------

            System.out.println("Birinci karakter:" + (char) (fis.read()));
            System.out.println("Ikinci karakter:" + (char) (fis.read()));
            System.out.println("Ucuncu karakter:" + (char) (fis.read()));

            // --------- 5 karakter atlayalim --------
            fis.skip(5);
            System.out.println("dokuzuncu karakter:" + (char) (fis.read()));


            //------------ tum dosyayi okuyalim
            int deger;
            String s = "";

            while ((deger = fis.read()) != -1) {
                s += (char) (deger);
            }
            System.out.println("Tum dosyanin Icerigi:");
            System.out.println(s);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found exception olustu");
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata olustu");
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu ");
            }
        }

    }
}
