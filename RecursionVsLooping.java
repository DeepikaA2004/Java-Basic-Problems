public class RecursionVsLooping {
    // Recursive method to calculate factorial
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Iterative method to calculate factorial
    public static int factorialLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        // Calculate factorial using recursion
        int recursiveResult = factorialRecursive(n);
        System.out.println("Factorial using recursion: " + recursiveResult);

        // Calculate factorial using looping
        int loopResult = factorialLoop(n);
        System.out.println("Factorial using looping: " + loopResult);
    }
}
