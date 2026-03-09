public class Main {
    public static void main(String[] args) {

        String[] lines = {
            String.join(" ", " *** ", " *** ", " ***** ", " ***** "),
            String.join(" ", "** **", "** **", "**   **", "**    "),
            String.join(" ", "** **", "** **", "**   **", "**    "),
            String.join(" ", "** **", "** **", " ***** ", " ***  "),
            String.join(" ", "** **", "** **", "**     ", "    **"),
            String.join(" ", "** **", "** **", "**     ", "**  **"),
            String.join(" ", " *** ", " *** ", "**     ", " **** ")
        };

        // for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}