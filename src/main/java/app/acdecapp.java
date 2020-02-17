package app;

import java.util.Scanner;

public class acdecapp {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int col = scanner.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = i; j <= col; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = col - 1; k >= i; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

