package app;

import java.util.Random;

public class arr {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[101];
        int[] posarr = new int[101];
        int[] negarr = new int[101];
        for (int i = 0; i < arr.length; i++) {
            int r1 = rand.nextInt(200 + 2) - 100;

            if (r1 > 0) posarr[i] = r1;
            if (r1 < 0) negarr[i] = r1;


        }
        System.out.println("positive ones");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + posarr[i]);
        }
        System.out.println("\n");

        System.out.println("negative ones");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + negarr[i]);
        }
    }
}