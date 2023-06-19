package org.arraylar.forEachDongusu;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"Elma", "Armut", "Kiraz"};

        for (String element : arr) {
            System.out.println(element);
        }

        System.out.println("-------------------------");

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        for (int i : arr2) {
            System.out.println(i);
        }


        Deneme[] denemes = {new Deneme("Ayse"), new Deneme("Mehmet"), new Deneme("Eymen"), new Deneme("Turkan")};

        for (Deneme deneme : denemes) {
            deneme.yaz();
        }
    }
}