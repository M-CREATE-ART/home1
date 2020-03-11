package app;

public class Brackets {

    public int calc(String origin) {
        int depth = 0;
        int max = 0;
        for (int i = 0; i < origin.length(); i++) {
            switch (origin.charAt(i)) {
                case '(':
                    depth++;
                    break;
                case ')':
                    depth--;
                    break;
            }
            max = Math.max(depth, max);

        }
        return max;
    }

}
