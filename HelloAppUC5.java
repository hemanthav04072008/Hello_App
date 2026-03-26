/**
 * HelloApp.java - UC5: Display "Hello" with Multiple Command-Line Arguments
 * using Enhanced For Loop or Default Message
 */

public class HelloApp {

    public static void main(String[] args) {

        String name = "World";

        // If arguments are provided
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String n : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(n);
                first = false;
            }

            name = nameBuilder.toString();
        }

        // Output
        System.out.println("Hello, " + name + "!");
    }
}