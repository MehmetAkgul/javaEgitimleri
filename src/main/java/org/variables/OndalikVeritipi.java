package org.variables;

public class OndalikVeritipi {

    public static void main(StringVariable[] args) {

        //Double : bellekte 64 bitlik yer kaplar   - yani 8 byte'lik yer kaplar
        //Float : bellekte 32 bitlik yer kaplar - yani 4 byte'lik yer kaplar

        // otomatik donusturme int ---> float --> double


        double a = 5.32;
        double b = 5.0;
        double c = 5d;
        double d = 5.32d;


        float x = (float) 5.0;
        float y = 5f;
        float z = 5.2f;


        int i = 22 / 7;
        float j = 22f / 7f;
        double k = 22d / 7d;

        System.out.println("i :" + i);
        System.out.println("j :" + j);
        System.out.println("k :" + k);

        //donusturme soldan saga yapilir
        double l = 3.52;
        //float m = l;// solda float var sagda dobule bu yuzden hata veriyor

        float n = 3.52f;
        double o = n;// solda double var sagda float bu yuzden hata vermez cunku donusumler soldan saga yapiliyor


    }
}
