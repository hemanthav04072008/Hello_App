/**
 * HelloApp.java - UC6: Display "Hello" with Multiple Command-Line Arguments
 * using substring to remove trailing delimiter
 */

public class HelloApp {

    public static void main(String[] args) {

        String name = "World";

        // If arguments are provided
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }

            // Remove last ", "
            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }

        // Output
        System.out.println("Hello, " + name + "!");
    }
}