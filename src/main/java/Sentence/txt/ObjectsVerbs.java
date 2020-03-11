package Sentence.txt;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class ObjectsVerbs {
    public static void main(String[] args) throws IOException {

        try {
            Map<String, List<String>> sv = read("subj_verb_.txt");
            Map<String, List<String>> vo = read("verb_obj_.txt");

            for (String s : sv.keySet()) {
                for (String v : sv.get(s)) {
                    for (String o : vo.get(v)) {
                        System.out.println(new SentenceRule(s, v, o));
                    }
                }
            }

        } finally {
            System.out.println(" not founded the file");
        }


    }

    private static HashMap<String, List<String>> read(String s) throws IOException {
        File ifile = new File(s);
        FileReader fr = new FileReader(ifile);
        BufferedReader br = new BufferedReader(fr);
        List<String> lines = br.lines().collect(Collectors.toList());

        HashMap<String, List<String>> hash = new HashMap<>();
        br.close();

        for (String line : lines) {

            String[] splitted = line.split(":");
            String key = splitted[0].trim();
            String[] valueArray = splitted[1].trim().split(", ");
            List<String> value = Arrays.asList(valueArray);
            hash.put(key,value);
        }

        return hash;
    }




}