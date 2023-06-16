package org.oop.composition1;

/**
 * HAS - A
 *
 */
public class Test {


    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18/5", resolution);
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Tamperli cam");
        Anakart anakart = new Anakart("B250-Pro", "Asus", 10, "Windows 10");

        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);

        pc.getKasa().bilgiayariAc();
        pc.getMonitor().monitoruKapat();
        pc.getAnakart().islemtim_sistemi_yukle("Ubuntu 16.04");
    }
}
