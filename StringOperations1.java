public class StringOperations1 {
    public static void main(String[] args) {
        String inputString = "hello, world!";
        // Check if the input string is not empty
        if (!inputString.isEmpty()) {
            // Make the first character uppercase
            String outputString = inputString.substring(0, 1).toUpperCase() + inputString.substring(1);
            // Print the modified string
            System.out.println("Original string: " + inputString);
            System.out.println("String with the first character capitalized: " + outputString);
        } else {
            System.out.println("The input string is empty.");
        }
    }
}
