import java.util.Scanner;
import java.util.Stack;

public class IntToBin {
  public static void main(String[] args) {
//    int value = 18;
//    String bin = "";
//    //
    //
    Scanner in = new Scanner(System.in);


    Stack<Integer> stack = new Stack<Integer>();

    // User input
    System.out.println("Enter decimal number: ");
    int num = in.nextInt();

    while (num != 0)
    {
      int d = num % 2;
      stack.push(d);
      num /= 2;
    }

    System.out.print("\nBinary representation is:");
    while (!(stack.isEmpty() ))
    {
      System.out.print(stack.pop());
    }
    System.out.println();
  }

  //  System.out.println(bin); // "00010010"

}
