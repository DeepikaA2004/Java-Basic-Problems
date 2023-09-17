public class PrimazonCompany {
    public static void main(String[] args) {
        // Given values
        int category1Quantity = 1500;
        double category1Value = 12000;
        double category2Rate = 25;
        double category2Value = 10000;
        int category3Quantity = 20000;
        double category3Rate = 35;
        // Calculate the missing values
        double category1Rate = category1Value / category1Quantity;
        int category2Quantity = (int) (category2Value / category2Rate);
        double category3Value = category3Rate * category3Quantity;
        // Print the results
        System.out.println("Rate for Category 1 (Garments): " + category1Rate);
        System.out.println("Quantity for Category 2 (Books): " + category2Quantity);
        System.out.println("Value for Category 3 (Electronic Gadgets): " + category3Value);
    }
}
