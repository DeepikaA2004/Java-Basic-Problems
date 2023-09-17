public class StringOperations3 {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        // Reverse alternate characters in the string
        String reversedString = reverseAlternateChars(inputString);
        // Print the modified string
        System.out.println("Original string: " + inputString);
        System.out.println("String with alternate characters reversed: " + reversedString);
    }

    public static String reverseAlternateChars(String input) {
        char[] charArray = input.toCharArray();
        // Traverse the string, starting from index 0 (even index)
        for (int i = 0; i < charArray.length; i += 2) {
            // Check if the next character is within the string bounds
            if (i + 1 < charArray.length) {
                char temp = charArray[i];
                charArray[i] = charArray[i + 1];
                charArray[i + 1] = temp;
            }
        }
        // Build the modified string
        return new String(charArray);
    }
}
