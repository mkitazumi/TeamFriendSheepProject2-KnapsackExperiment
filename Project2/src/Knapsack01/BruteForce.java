package Knapsack01;

public class BruteForce {

    public static int knapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int maxValue = 0;

        // Iterate through all possible subsets of items
        for (int i = 0; i < (1 << n); i++) {
            int currentValue = 0;
            int currentWeight = 0;
            for (int j = 0; j < n; j++) {
                // Check if item j is included in the subset
                if ((i & (1 << j)) != 0) {
                    currentValue += values[j];
                    currentWeight += weights[j];
                }
            }

            // Update maxValue if current subset fits and has higher value
            if (currentWeight <= capacity && currentValue > maxValue) {
                maxValue = currentValue;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        int n = values.length;

        int result = knapsack(values, weights, capacity);
        System.out.println("Maximum value: " + result);
    }
}
