import java.util.Random;

/**
 * http://www.asciitable.com/index/asciifull.gif
 * https://cdn.cs50.net/2016/x/psets/0/pset0/bulbs.html
 * http://sticksandstones.kstrom.com/appen.html
 */
public class StringOps {
  

  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  String invertCase(String origin) {
    throw new RuntimeException("should be implemented");
  }
  String myString = "HelloWorld";


  Random randomNumber = new Random();

    //    for (int i = 0; i < 10; i++) {

    int randomNo = randomNumber.nextInt(myString.length());


    Character character = myString.charAt(randomNo);

    //System.out.println("Random Character : " + Character.toUpperCase(character));
 // }

  // abc -> ABC
  // aBc -> ABC
  // Abc -> ABC
  String toUpperCase(String origin) { // a -> A A -> A
    throw new RuntimeException("should be implemented");
  }

  // abc -> abc
  // aBc -> abc
  // Abc -> abc
  String toLowerCase(String origin) { // A -> a a -> a
    throw new RuntimeException("should be implemented");
  }

}
