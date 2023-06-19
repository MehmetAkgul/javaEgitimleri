package org.arraylar;

import java.util.Scanner;

public class MultidimensionalArray {

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5, 6};


        int[][] ar2 = new int[2][2];

        ar2[0][0] = 21;
        ar2[0][1] = 22;
        ar2[1][0] = 31;
        ar2[1][1] = 32;

        int[][] ar3 = {{1, 2, 3, 4,}, {10, 20, 30, 40}, {9, 99, 999, 9999}};


        Scanner scanner = new Scanner(System.in);
        int[][] ar4 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ar4[i][j] = scanner.nextInt();
            }
        }

        System.out.println("*************************");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ar4[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
