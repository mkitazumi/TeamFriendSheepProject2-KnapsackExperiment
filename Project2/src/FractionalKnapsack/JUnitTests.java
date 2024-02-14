package FractionalKnapsack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JUnitTests {
    @Test
    public void testMultipleItemsWithCapacityLimitBruteForce() {
        int[] weights = {2, 3, 1, 4};
        int[] values = {4, 5, 2, 1};
        int capacity = 5;
        int expectedMaxValue = 9;


        double actualMaxValue = BruteForce.BruteForceFraction(values, weights, capacity);

        assertEquals(expectedMaxValue, actualMaxValue);
    }
    @Test
    public void testFractionalMultipleItemsWithCapacityLimitBruteForce() {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        double expectedMaxValue = 240.0;


        double actualMaxValue = BruteForce.BruteForceFraction(values, weights, capacity);

        assertEquals(expectedMaxValue, actualMaxValue);
    }
    @Test
    public void testOneItemFitsPerfectlyBruteForce() {
        int[] weights = {5};
        int[] values = {10};
        int capacity = 5;
        int expectedMaxValue = 10;


        double actualMaxValue = BruteForce.BruteForceFraction(values, weights, capacity);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testZeroValuesBruteForce() {
        int[] weights = {0, 0, 0};
        int[] values = {0, 0, 0};
        int capacity = 10;
        int expectedMaxValue = 0;



        double actualMaxValue = BruteForce.BruteForceFraction(values, weights, capacity);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testNoWholeItemFitsBruteForce() {
        int[] weights = {10, 20, 30};
        int[] values = {100, 240, 300};
        int capacity = 5;
        int expectedMaxValue = 60;


        double actualMaxValue = BruteForce.BruteForceFraction(values, weights, capacity);

        assertEquals(expectedMaxValue, actualMaxValue);
    }
}
