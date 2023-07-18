package org.Map.HashMap.harfFrekansi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // Treemap kullanarak bir  string icindeki harflerin frekansini bulma

        Scanner scanner = new Scanner(System.in);


        System.out.println("Cumleyi Giriniz : ");

        String cumle = scanner.nextLine();

        Map<Character, Integer> frekans = new TreeMap<>();


        for (int i = 0; i < cumle.length(); i++) {

            char c = cumle.charAt(i);

            if (frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c) + 1);
            } else {
                frekans.put(c, 1);
            }

        }

        for (Map.Entry entry : frekans.entrySet()) {
            System.out.println("karakter : " + entry.getKey() + " " + entry.getValue() + " kadar geciyor...");
        }
    }
}
