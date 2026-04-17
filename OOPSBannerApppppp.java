public class OOPSBannerApppppp {

    /**
     * Inner Static Class to store character and its banner pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character Character to be displayed
         * @param pattern Banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a given character
     * @param ch input character
     * @param patterns array of CharacterPatternMap
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7]; // empty pattern fallback
    }

    /**
     * Utility method to print banner
     * @param text input word
     * @param patterns character pattern mappings
     */
    public static void printBanner(String text, CharacterPatternMap[] patterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        // Initialize StringBuilders
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner row by row
        for (char ch : text.toCharArray()) {
            String[] charPattern = getCharacterPattern(ch, patterns);

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(charPattern[i]).append("  ");
            }
        }

        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Create CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        // Print Banner
        printBanner("OOPS", patterns);
    }
}