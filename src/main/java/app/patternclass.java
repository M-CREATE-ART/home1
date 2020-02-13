package app;

import java.util.Scanner;

public class patternclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n=in.nextInt();
        int  m=in.nextInt();
        for( int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                if (i==0 || j==0 || i==n-1 || j==m-1 || i == j || j + i + 1 == n + m)
                    System.out.println("*");




        }
        System.out.println(" ");

    }
}
