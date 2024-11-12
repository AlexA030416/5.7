public class Main {
    public static void main(String[] args) {
        // Initial tuition cost
        double tuition = 10000;
        double annualIncreaseRate = 0.05;

        // Calculate the tuition after 10 years
        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + annualIncreaseRate);
        }

        double tuitionInTenYears = tuition;
        System.out.printf("Tuition in 10 years: $%.2f%n", tuitionInTenYears);

        // Calculate the total cost for four years starting from the 10th year
        double totalCost = 0;
        for (int year = 1; year <= 4; year++) {
            totalCost += tuition;
            tuition *= (1 + annualIncreaseRate);
        }

        System.out.printf("Total cost for four years after the 10th year: $%.2f%n", totalCost);
    }
}
