package org.genericler.Methodlar;

import org.genericler.Classlar.Ogrenci;

public class Test {
    public static void main(String[] args) {


        Character[] char_dizi = {'j', 'k', 'l', 's'};
        Integer[] integer_dizi = {1, 2, 3, 4, 5, 6, 7};
        String[] string_dizi = {"Java", "Phyton", "C++", "PHP" };

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mehmet"), new Ogrenci("Turkan"), new Ogrenci("Ayse"), new Ogrenci("Eymen")};

        yazdir(char_dizi);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrenci_dizi);

    }

    public static <E> void yazdir(E[] dizi) {
        for (E e : dizi) {
            System.out.println(e);
        }
    }
}
