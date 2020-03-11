package app.blaBla;

import java.util.Scanner;

public class Calculate{
    public static void main(String[] args) {

        String num1;
        String num2;
        String operation;


        Scanner input = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

        num1 = input.nextLine();
        operation = op.next();
        num2 = input.nextLine();
        if (operation == "+") ;
        {
            System.out.println("your answer is" + (num1 + num2));
        }



    }
}
