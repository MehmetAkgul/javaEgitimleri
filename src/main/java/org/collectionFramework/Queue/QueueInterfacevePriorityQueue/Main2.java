package org.collectionFramework.Queue.QueueInterfacevePriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player> {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player{" + "isim='" + isim + '\'' + ", id=" + id + '}';
    }

    @Override
    public int compareTo(Player player) {
       /* if (this.id < player.id) return 1;
        if (this.id > player.id) return -1;
        return 0;*/

        return -Integer.compare(this.id, player.id);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Queue<Player> queue = new PriorityQueue<>();
        queue.offer(new Player("Mehmet", 5));
        queue.offer(new Player("Turkan", 3));
        queue.offer(new Player("Ayse", 9));
        queue.offer(new Player("Eymen", 2));

        while (!queue.isEmpty()) {
            System.out.println("Eleman Cikariliyor" + queue.poll());
        }
    }


}
