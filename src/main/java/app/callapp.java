package app;

public class callapp {
package lesson01;

    public class addapp {
        public static void main(String[] args) {
            System.out.println("get the sum of given two numbers");
            Scanner in = new Scanner(System.in);
            float  a=in.nextfloat();
            float  b=in.nextfloat();
            float  c=a+b;
            float  d= a-b;
            float  e=a*b;
            float  f=a/b;

            System.out.println("sum is =" +c);
            System.out.println("sub is =" +d);
            System.out.println("mult is =" +e);
            System.out.println("div is =" +f);

}