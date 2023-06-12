package org.DonguYapilari;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        // break icinde bulunugu donguyu sonlandirir

        int i = 0;
        while (i<20){

            if (i==10) break;
            System.out.println("i = " + i);

            i++;
        }

        // continue eger kullanilirsa dongu icindeki islemleri yapmadan dongunun basina donuyor

        for (int k=0; k<10 ; k++) {


            if (k==3 || k==5) continue;

            System.out.println("k = " + k);
        }




        Scanner scanner = new Scanner(System.in);

        while (true){

            int islem =scanner.nextInt();


            if (islem ==-1) {
                System.out.println("donguden cikiliyor");
                break;
            }
            System.out.println("islem = " + islem);

        }

    }
}
