package app.blaBla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
public class CharacterPositions {
    public static void main(String[] args) {
        String origin = "Hello World";
        HashMap<Character, List<Integer>> map = new HashMap<>();

        IntStream.range(0, origin.length()).forEach(i -> {
            char c = origin.charAt(i);
            List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
            positions.add(i + 1);
            map.put(c, positions);
        });


        map.forEach((c, n) ->
                System.out.printf("Letter: '%c', count: %d, positions:%s\n", c, n.size(), n));
//        List<Integer> positions = null;
//        Collections.sort(positions,Collections.reverseOrder());
//        System.out.println("Result of position Sorting:");
//            System.out.println(positions);
//        }

    }
}
    // HAshMap<Character, List<Integer>> map=new HashMAp<>();




