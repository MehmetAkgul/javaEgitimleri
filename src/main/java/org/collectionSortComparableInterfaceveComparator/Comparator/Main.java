package org.collectionSortComparableInterfaceveComparator.Comparator;


import java.util.*;

class BuyuktenKucugeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

class KucuktenBuyugeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class BuyuktenKucugePlayer implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() > o2.getId()) {
            return -1;
        } else if (o1.getId() < o2.getId()) {
            return 1;
        }
        return 0;
    }
}

class KucuktenBuyugePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        }
        return 0;
    }
}

class Player {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list, new KucuktenBuyugeString());
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

       // Collections.sort(list2, new BuyuktenKucugePlayer());
        Collections.sort(list2, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
               return o1.getIsim().compareTo(o2.getIsim());
            }
        });
        for (Player player: list2) {
            System.out.println(player);
        }

    }
}