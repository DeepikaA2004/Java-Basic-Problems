public class SecondMaxElement {
    public static void main(String[] args) {
        int[] numbers = { 5, 12, 8, 15, 20, 10 };

        int firstMax = Integer.MIN_VALUE; // Initialize to smallest possible value
        int secondMax = Integer.MIN_VALUE; // Initialize to smallest possible value

        for (int number : numbers) {
            if (number > firstMax) {
                secondMax = firstMax;
                firstMax = number;
            } else if (number > secondMax && number != firstMax) {
                secondMax = number;
            }
        }

        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("Second Maximum Element: " + secondMax);
        } else {
            System.out.println("No second maximum element found.");
        }
    }
}
