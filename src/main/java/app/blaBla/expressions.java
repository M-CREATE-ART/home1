package app.blaBla;

import org.graalvm.compiler.loop.MathUtil;

import java.util.Scanner;

public class expressions {
    public static void main(String[] args) {
      Calculate();
    }

    public static void Calculate() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        double a=sc.nextDouble();
        System.out.println("enter second number");
        double b= sc.nextDouble();
        System.out.println("choose operation");
        int c= sc.nextInt();
        double result=0;
        switch (c){
            case 1:
                result = MathUtil.sum(a,b );
            case 2:
                result = MathUtil.cons(a, b);
            case 3:
                result = MathUtil.pro(a,b);
            case 4:
                result = MathUtil.div(a,b );

            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }

    }

}
