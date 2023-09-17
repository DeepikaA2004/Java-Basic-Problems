public class StringOperations4 {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        // Replace vowels with special characters in the string
        String replacedString = replaceVowelsWithSpecialChars(inputString);
        // Print the modified string
        System.out.println("Original string: " + inputString);
        System.out.println("String with vowels replaced by special characters: " + replacedString);
    }

    public static String replaceVowelsWithSpecialChars(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            // Check if the character is a vowel (uppercase or lowercase)
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                // Replace vowels with a special character (e.g., *)
                result.append('*');
            } else {
                // Keep non-vowel characters as they are
                result.append(ch);
            }
        }
        return result.toString();
    }
}
