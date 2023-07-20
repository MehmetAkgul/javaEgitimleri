package org.File.FileInputOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosyayaVeriYazma {
    public static void main(String[] args) {


        FileOutputStream fos = null;

        //   fos = new FileOutputStream("notlar.txt");


        File file = new File("notlar.txt");// yeni dosya olusturdum

        try {
            //fos = new FileOutputStream(file);//  hepsini sil ve yeniden yaz
            fos = new FileOutputStream(file, true);//  devamina yaz

            fos.write(65);
            fos.write(74);//hepsini sil ve yeniden yaz

    // ------------byte arrayi ile dosya yazmak---------------
            byte[] array = {101, 75, 66, 68};
            fos.write(array);

    // ------------String leri dosyaya yazmak---------------
            String s = " mehmet ";
            byte[] s_array = s.getBytes();
            fos.write(s_array);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found exception olustu");
        } catch (IOException e) {
            System.out.println("Dosyaya yazilirken bir hata olustu");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu ");
            }
        }

    }
}
