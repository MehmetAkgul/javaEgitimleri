package org.collectionFramework.IterableClasslar.KumandaProjesiIterableInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String> {
    private ArrayList<String> kanallar = new ArrayList<>();


    public class KumandaIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            /*
            if (index >= kanallar.size())
                return false;
            else
                return true;
                **/

            return index < kanallar.size();
        }

        @Override
        public String next() {
            String kanal = kanallar.get(index);
            index++;
            return kanal;
        }
    }

    public void kanalEkle(String kanal) {
        kanallar.add(kanal);
    }

    public void kanalSil(String kanal) {
        if (kanallar.contains(kanal))
            kanallar.remove(kanal);
        else
            System.out.println("girdiginiz kanal listenizde bulunamadi...");

    }

    public int kanalSayisi() {
        return kanallar.size();
    }

    @Override
    public Iterator<String> iterator() {
        return new KumandaIterator();
    }
}
