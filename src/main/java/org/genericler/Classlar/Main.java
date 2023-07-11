package org.genericler.Classlar;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> arrayList1 = new ArrayList<String>();
        //ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        Character[] char_dizi = {'j', 'k', 'l', 's'};
        Integer[] integer_dizi = {1, 2, 3, 4, 5, 6, 7};
        String[] string_dizi = {"Java", "Phyton", "C++", "PHP" };

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mehmet"), new Ogrenci("Turkan"), new Ogrenci("Ayse"), new Ogrenci("Eymen")};

//
//        CharYazdir.yazdir(char_dizi);
//        System.out.println("******************************");
//        StringYazdir.yazdir(string_dizi);
//        System.out.println("******************************");
//        IntegerYazdir.yazdir(integer_dizi);
//        System.out.println("******************************");
//        OgrenciYazdir.yazdir(ogrenci_dizi);


        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<Integer> yazdir_integer = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();

        yazdir_char.yazdir(char_dizi);
        System.out.println("******************************");
        yazdir_string.yazdir(string_dizi);
        System.out.println("******************************");
        yazdir_integer.yazdir(integer_dizi);
        System.out.println("******************************");
        yazdir_ogrenci.yazdir(ogrenci_dizi);

    }
}
