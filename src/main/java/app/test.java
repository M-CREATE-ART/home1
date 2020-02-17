package app;

import java.util.Arrays;
public class test {



        public static void main(String[] args)
        {

            // Get the Arrays
            int intArr[] = { 10, 20, 15, 22, 35 };

            int intKey = 55;

            Arrays.fill(intArr, intKey);

            // To fill the arrays
            System.out.println("Integer Array on filling: "
                    + Arrays.toString(intArr));
        }
    }


