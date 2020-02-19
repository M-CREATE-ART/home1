package app;

public class abc {
    public static void main(String[] args) {
        int range = 'Z'-'A' + 1;
        int start = 'A';
        StringBuilder alpha = new StringBuilder();
        for (int i = 0; i < 28; i++) {
            char letter = (char) (Math.random() * range + start);
            alpha.append(letter);

        }
        String random = alpha.toString();
        StringBuilder abc = new StringBuilder();
        System.out.println(alpha.toString() );
    }
}
