package app;

import java.util.Random;

public class method {
    public static void main(String[] args) {

        Random round=new Random();
        int [] a1 = new int[100];
        int [] two=new int[100];
        int [] seven= new int[100];
        int [] eleven= new int[100];
        int r1= round.nextInt();

        for(int i=0; i<a1.length; i++){
            if(r1%2==0){
               two[i]= r1;
                System.out.println( + two[i]);}
                if (r1%7==0){
                    seven[i]= r1;
            System.out.println(+ seven[i]);}
            if (r1%11==0) {
                eleven [i] = r1;
                System.out.println(+ eleven[i]);

            }

        }
    }

}
