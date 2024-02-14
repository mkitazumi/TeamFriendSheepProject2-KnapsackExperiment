package Knapsack01;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTests {

    @Test
    public void testZeroValuesDynamic() {
        int[] weights = {0, 0, 0};
        int[] values = {0, 0, 0};
        int capacity = 10;
        int elements = 3;
        int expectedMaxValue = 0;


        int actualMaxValue = Dynamic.knapsackDyProg(weights, values, capacity, elements);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testOneItemFitsPerfectlyDynamic() {
        int[] weights = {5};
        int[] values = {10};
        int elements = 1;
        int capacity = 5;
        int expectedMaxValue = 10;

        int actualMaxValue = Dynamic.knapsackDyProg(weights, values, capacity, elements);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testMultipleItemsWithCapacityLimitDynamic() {
        int[] weights = {2, 3, 1, 4};
        int[] values = {4, 5, 2, 1};
        int capacity = 5;
        int elements = 4;
        int expectedMaxValue = 9;

        int actualMaxValue = Dynamic.knapsackDyProg(weights, values, capacity, elements);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testNoItemFitsDynamic() {
        int[] weights = {10, 20, 30};
        int[] values = {100, 200, 300};
        int capacity = 5;
        int elements = 3;
        int expectedMaxValue = 0;


        int actualMaxValue = Dynamic.knapsackDyProg(weights, values, capacity, elements);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testZeroValuesBruteForce() {
        int[] weights = {0, 0, 0};
        int[] values = {0, 0, 0};
        int capacity = 10;
        int elements = 3;
        int expectedMaxValue = 0;



        int actualMaxValue = BruteForce.knapsack(values, weights, capacity);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testOneItemFitsPerfectlyBruteForce() {
        int[] weights = {5};
        int[] values = {10};
        int elements = 1;
        int capacity = 5;
        int expectedMaxValue = 10;


        int actualMaxValue = BruteForce.knapsack(values, weights, capacity);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testMultipleItemsWithCapacityLimitBruteForce() {
        int[] weights = {2, 3, 1, 4};
        int[] values = {4, 5, 2, 1};
        int capacity = 5;
        int elements = 4;
        int expectedMaxValue = 9;


        int actualMaxValue = BruteForce.knapsack(values, weights, capacity);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testNoItemFitsBruteForce() {
        int[] weights = {10, 20, 30};
        int[] values = {100, 200, 300};
        int capacity = 5;
        int elements = 3;
        int expectedMaxValue = 0;


        int actualMaxValue = BruteForce.knapsack(values, weights, capacity);

        assertEquals(expectedMaxValue, actualMaxValue);
    }

}