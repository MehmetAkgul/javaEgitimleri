package org.hashCodeveEquals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {
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
}

public class Main {

    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        hashset.add("Java");
        hashset.add("Python");
        hashset.add("C++");



        for (String s : hashset) {
            System.out.println(s);
        }

        Set<Player> hashset2 = new HashSet<Player>();

        Player player1 = new Player("Mustafa", 1);
        Player player2 = new Player("Mehmet", 10);
        Player player3 = new Player("Emre", 6);
        Player player4 = new Player("Mustafa", 1);

        hashset2.add(player1);
        hashset2.add(player2);
        hashset2.add(player3);
        hashset2.add(player4);

        for (Player p : hashset2) {
            System.out.println(p);
        }


    }
}
