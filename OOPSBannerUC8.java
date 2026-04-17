
import java.util.*;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        String word = "OOPS";

        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }
}