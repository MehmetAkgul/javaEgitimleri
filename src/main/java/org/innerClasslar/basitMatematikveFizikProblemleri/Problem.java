package org.innerClasslar.basitMatematikveFizikProblemleri;

public class Problem {

    public static class Matematik {

        public static void daireAlanHesapla(int yaricap) {
            System.out.println("Dairenin alani :" + (yaricap * yaricap * Math.PI));
        }

        public static void ucgenCevresiHesapla(int kenar1, int kenar2, int kenar3) {
            System.out.println("Ucgenin cevresi :" + (kenar1 + kenar2 + kenar3));
        }
    }

    public static class Fizik {
        public static void icCarpim(Vec vec1, Vec vec2) {
            int ic_carpim = vec1.getI() * vec1.getI() + vec1.getK() * vec1.getK() + vec1.getJ() * vec1.getJ();
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " in ic carpimi = " + ic_carpim);
        }
    }

}
