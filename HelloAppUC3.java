/**
 * HelloApp.java - UC3: Display "Hello" with Command-Line Argument or Default Message
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if user provided argument
        if (args.length > 0) {
            name = args[0];
        }

        // Display message
        System.out.println("Hello, " + name + "!");
    }
}