package app;

import java.util.Scanner;

public class TwoDApp {
    public static void main(String[] args) {


    Scanner in= new Scanner(System.in);
    int rows=in.nextInt();
    int columns=in.nextInt();
    int[][] twoD;
       for (int i=0; i<rows; i++){
           for(int j=0; j< columns-i-1; j++ ) {

               System.out.println(+j);
           }

    }

}
}
