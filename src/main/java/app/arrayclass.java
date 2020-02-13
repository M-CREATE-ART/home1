package app;

import java.util.Random;

public class arrayclass {
        public static void main(String[] args) {
            int evensum=0;
            int oddsum=0;
            //int i=0;
            Random rand = new Random();
            int[] Array = new int[30];
            int[] oddarr = new int[30];


            for( int i=0; i< Array.length; i++) {
                int r1= rand.nextInt(40 + 1) - 20;
                int r2= rand.nextInt(60 + 1) - 30;
                if(r1%2==0) {
                    Array[i] = r1;
                }
                if(r2%2!=0){
                    oddarr[i]= r2;
                }
            //rand.nextInt()
            }
            for( int i=0; i< Array.length; i++) {
                evensum+=Array[i];
            }

            for( int i=0; i< oddarr.length; i++) {
                oddsum+=oddarr[i];
            }
            System.out.println("even sum" +evensum);
            System.out.println("odd sum" +oddsum);
            System.out.println("total sum" +(evensum +oddsum));
        }




    }


