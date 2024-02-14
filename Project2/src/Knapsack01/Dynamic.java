package Knapsack01;

import java.util.*;

public class Dynamic {

    /**
     *
     * @param weight Array of the weights that will go into the 'knapsack'
     * @param value Array of the values that will go into the 'knapsack'
     * @param capacity The capacity of the knapsack
     * @param n The number of elements of the items that will be considered for the knapsack
     */
    public static int knapsackDyProg(int weight[], int value[], int capacity, int n) {
        int B[][] = new int[n + 1][capacity + 1];

        for (int i=0; i<=n; i++)
            for (int j=0; j<=capacity; j++) {
                B[i][j] = 0;
            }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                B[i][j] = B[i - 1][j];

                if ((j >= weight[i-1]) && (B[i][j] < B[i - 1][j - weight[i - 1]] + value[i - 1])) {
                    B[i][j] = B[i - 1][j - weight[i - 1]] + value[i - 1];
                }

//                System.out.print(B[i][j] + " ");
            }
//            System.out.print("\n");
        }

        System.out.println("Knapsack Value:\t" + B[n][capacity]);
        int result = B[n][capacity];


        System.out.println("Selected Packs: ");

        while (n != 0) {
            if (B[n][capacity] != B[n - 1][capacity]) {
                System.out.println("\tPackage " + n + " with weight = " + weight[n - 1] + " and Value = " + value[n - 1]);

                capacity = capacity - weight[n-1];
            }

            n--;

        }
        return result;
    }

    public static void main(String[] args) {
        int w = 10;
        int n = 4;
        int[] val = {10, 40, 30, 50};
        int[] wt = {5, 4, 6, 3};

        Dynamic dynamicSolver = new Dynamic();

        // Call the knapsackDyProg method on the instance
        dynamicSolver.knapsackDyProg(wt, val, w, n);


    }

}
