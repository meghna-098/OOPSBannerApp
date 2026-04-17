/**
 * OOPS Banner App - UC8
 * Uses HashMap to store and retrieve character patterns
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApppppppp {

    /**
     * Utility method to build and return character patterns map
     * 
     * @return Map of character to pattern
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        // Pattern for O
        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        // Pattern for P
        map.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        // Pattern for S
        map.put('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        return map;
    }

    /**
     * Utility method to get pattern for a character
     * 
     * @param ch input character
     * @param map character pattern map
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, Map<Character, String[]> map) {
        return map.getOrDefault(ch, new String[]{
            " ", " ", " ", " ", " ", " ", " "
        });
    }

    /**
     * Utility method to print banner
     * 
     * @param text input word
     * @param map character pattern map
     */
    public static void printBanner(String text, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, map);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Build Map
        Map<Character, String[]> patternMap = buildCharacterPatterns();

        // Print Banner
        printBanner("OOPS", patternMap);
    }
}