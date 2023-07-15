package org.interfaceSiniflar.ders1.yurtDisiCikisProgrami;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gokcen Havalimanina Hosgeldiniz ");

        String sartlar = "yurtdisi Cikis Kurallari ... \n" +
                "Herhangi bir cikis yasaginizin bulunmamasi gerekiyor \n" +
                "15 Tl cikis harcini tam olarak yatirmaniz gerekiyor \n" +
                "Gideceginiz ulkeye vizenizin bulunmasi gerekiyor... ";

        String message = " Yurtdisi sartlarindan hepsini sasglamaniz gerekiyor...";

        while (true) {
            System.out.println("****************************************");
            System.out.println(sartlar);
            System.out.println("****************************************");
            Yolcu yolcu = new Yolcu();

            System.out.println("Harc bedeli kontrol Ediliyor...");
            Thread.sleep(3000);
            if (!yolcu.yurtDisiHarciKontrol()) {
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi Yasak kontrol Ediliyor...");
            Thread.sleep(3000);

            if (!yolcu.siyasiYasakKontrol()) {
                System.out.println(message);
                continue;
            }
            System.out.println("Vizeniz kontrol Ediliyor...");
            Thread.sleep(3000);

            if (!yolcu.vizeDurumuKontrol()) {
                System.out.println(message);
                continue;
            }
            System.out.println("Yurtdisina Cikabilirsiniz... Iyi yolculuklar...");

        }
    }
}
