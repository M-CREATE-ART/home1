package app;

import java.util.Random;

public class string {

    public static void main(String[] args) {
        final String UPPVOW = "AEOIU";
        final String UPPCON="BCDFGHJKLMNPQRSTVXZ";
        final String LOWVOW="aeiou";
        final String LOWCON="bcdfghjklmnpqrstvwxyz";
        int range = 'Z'-'a' + 1;
        int start = 'a';
        StringBuilder rand_s = new StringBuilder();
        for (int i = 0; i < 60; i++) {
            char letter = (char) (Math.random() * range + start);
            rand_s.append(letter);
        }
        String random = rand_s.toString();
        StringBuilder UPPERvowels = new StringBuilder();
        StringBuilder UPPERconsonants = new StringBuilder();
        StringBuilder LOWERvowels = new StringBuilder();
        StringBuilder LOWERconsonants = new StringBuilder();
        for (int i = 0; i < random.length(); i++) {
            char c = random.charAt(i);
            if(UPPVOW.contains(String.valueOf(c)))
                UPPERvowels.append(c);
            if(UPPCON.contains(String.valueOf(c)))
                UPPERconsonants.append(c);
            if(LOWCON.contains(String.valueOf(c)))
                LOWERconsonants.append(c);
            if(LOWVOW.contains(String.valueOf(c)))
                LOWERvowels.append(c);

        }

        System.out.println(random);
        System.out.println( UPPERvowels.toString());
        System.out.println(UPPERconsonants.toString());
        System.out.println(LOWERconsonants.toString());
        System.out.println(LOWERvowels.toString());
    }
}
