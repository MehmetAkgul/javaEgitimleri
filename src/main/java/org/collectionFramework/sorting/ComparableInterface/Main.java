package org.collectionFramework.sorting.ComparableInterface;


import java.util.*;

class Player implements Comparable<Player> {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "||| ID:" + id + " isim : " + isim + " |||";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(isim, player.isim);
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.isim);
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return 1;
        } else if (this.id > player.id) {
            return -1;
        }
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

        List<Player> list2 = new ArrayList<>();

        Player player1 = new Player("Mehmet", 1);
        Player player2 = new Player("Mustafa", 20);
        Player player3 = new Player("Ayse", 3);
        Player player4 = new Player("Turkan", 2);

        list2.add(player1);
        list2.add(player2);
        list2.add(player3);
        list2.add(player4);


        Collections.sort(list2);
        for (Player player : list2) {
            System.out.println(player);
        }
        System.out.println("******** tree set ");
        Set<Player> treeSet = new TreeSet<>();
        treeSet.add( new Player("Mehmet", 1));
        treeSet.add(new Player("Mustafa", 20));
        treeSet.add( new Player("Ayse", 3));
        treeSet.add( new Player("Turkan", 2));

        for (Player player : treeSet) {
            System.out.println(player);
        }


    }
}