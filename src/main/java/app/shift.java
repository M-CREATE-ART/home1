package app;

import java.util.Random;

public class shift {
    public static void main(String[] args) {
        Random rand= new Random();
        int [] arr= new int[25];
        int temp = 0;

         for(int i=0; i< arr.length; i++) {
             int r1 = rand.nextInt(20 + 1) - 10;
             arr[i] = r1;
         }
        System.out.println("Original array");
        for(int i=0;i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
               temp=arr[arr.length-1];
             for( int i=arr.length-1; i>0 ; i--)
             {

               if(arr[i] > 0){
                 arr[i] = arr[i - 1];
             }
             }
             arr[0]=temp;
        System.out.println("\nNew array after shifting ");
        for( int i=0; i<arr.length ;i++)
        {
            System.out.print(arr[i]+" ");
        }
         }

    }


