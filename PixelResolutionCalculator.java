import java.util.Arrays;

public class PixelResolutionCalculator {
    public static void main(String[] args) {
        // Pixel resolutions
        double[] resolutions = { 12.2, 13.7, 15.3, 17.2, 18.1 };
        // Calculate the mean resolution
        double mean = calculateMean(resolutions);
        // Calculate the median resolution
        double median = calculateMedian(resolutions);
        // Print the results
        System.out.println("Mean Resolution: " + mean);
        System.out.println("Median Resolution: " + median);
    }

    public static double calculateMean(double[] resolutions) {
        double sum = 0;
        for (double resolution : resolutions) {
            sum += resolution;
        }
        return sum / resolutions.length;
    }

    public static double calculateMedian(double[] resolutions) {
        Arrays.sort(resolutions);
        int middle = resolutions.length / 2;
        if (resolutions.length % 2 == 0) {
            return (resolutions[middle - 1] + resolutions[middle]) / 2.0;
        } else {
            return resolutions[middle];
        }
    }
}
