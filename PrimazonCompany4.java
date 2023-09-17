public class PrimazonCompany4 {
    public static void main(String[] args) {
        // Given values
        int category1Quantity = 1500;
        int category2Quantity = 0; // To be calculated
        int category3Quantity = 20000;
        // Calculate category 2 quantity based on the given value
        double category2Value = 10000;
        double category2Rate = 25;
        category2Quantity = (int) (category2Value / category2Rate);
        // Find the maximum quantity among all three categories
        int maxQuantity = Math.max(category1Quantity, Math.max(category2Quantity, category3Quantity));
        // Print the maximum quantity
        System.out.println("Maximum Quantity among all three categories: " + maxQuantity);
    }
}
