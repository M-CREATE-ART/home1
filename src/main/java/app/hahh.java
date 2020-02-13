package app;

import java.util.Scanner;

public class hahh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n=in.nextInt();
        for( int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                if (i==0 || j==0 || i==n-1 || j==n-1 || i == j || j + i + 1 == n)
                    System.out.println("*");




        }
                             System.out.println(" ");
    }


}
