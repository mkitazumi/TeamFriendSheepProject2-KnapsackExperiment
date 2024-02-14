package FractionalKnapsack;



public class BruteForce {

    public static double BruteForceFraction(int[] values, int[] weights, int capacity) {
        int n = values.length;
        double maxValue = 0;

        for(int i = 0; i < (1 << n); i++){
            double currentValue = 0;
            double currentWeight = 0;
            double [] quantities = new double[n];

            // Calculate quantity for each item in the subset
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    // Check if the remaining capacity allows for a full item
                    if (currentWeight + weights[j] <= capacity) {
                        quantities[j] = 1;
                    } else {
                        // Add a partial item using remaining capacity
                        double remainingCapacity = capacity - currentWeight;
                        quantities[j] = Math.min(1.0, remainingCapacity / weights[j]);
                    }

                    currentValue += quantities[j] * values[j];
                    currentWeight += quantities[j] * weights[j];
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

        double result = BruteForceFraction(values, weights, capacity);
        System.out.println("Maximum value: " + result);
    }
}
