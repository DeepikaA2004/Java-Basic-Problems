public class DepreciationCalculator {
    public static void main(String[] args) {
        double initialCost = 1000000.0; // Initial cost in lakhs
        double scrapValue = 250000.0; // Scrap value in lakhs
        int usefulLife = 25; // Useful life in years
        // Calculate depreciation amount
        double depreciationAmount = (initialCost - scrapValue) / usefulLife;
        // Calculate depreciation rate
        double depreciationRate = (depreciationAmount / initialCost) * 100;
        System.out.println("Initial Cost: " + initialCost + " lakhs");
        System.out.println("Scrap Value: " + scrapValue + " lakhs");
        System.out.println("Useful Life: " + usefulLife + " years");
        System.out.println("Depreciation Amount per Year: " + depreciationAmount + " lakhs");
        System.out.println("Depreciation Rate per Year: " + depreciationRate + "%");
    }
}
