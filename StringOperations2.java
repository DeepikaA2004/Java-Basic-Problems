public class StringOperations2 {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        // Remove vowels from the string
        String remainingString = removeVowels(inputString);
        // Print the remaining string
        System.out.println("Original string: " + inputString);
        System.out.println("Remaining string without vowels: " + remainingString);
    }

    public static String removeVowels(String input) {
        // Regular expression to match vowels (both uppercase and lowercase)
        String pattern = "[aeiouAEIOU]";
        // Remove vowels from the input string and return the result
        return input.replaceAll(pattern, "");
    }
}
