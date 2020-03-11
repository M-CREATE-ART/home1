package app.blaBla;

import java.util.Scanner;

import static app.blaBla.MathUtil.MathUtil.*;

public class expressions {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        double a = sc.nextDouble();
        String c = op.next();
        double b = sc.nextDouble();
        if (c == "+")
            System.out.println(sum(a, b));
        else if (c == "-")
            System.out.println(cons(a, b));
        else if (c == "*")
            System.out.println(pro(a, b));
        else if (c == "/")
            System.out.println(div(a, b));
        else
            throw new IllegalStateException("Unexpected expression: " + c);


    }
}



