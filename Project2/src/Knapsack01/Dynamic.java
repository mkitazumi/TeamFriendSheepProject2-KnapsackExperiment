package Knapsack01;

import java.util.*;

public class Dynamic {
    public void knapsackDyProg(int W[], int V[], int M, int n) {
        int B[][] = new int[n + 1][M + 1];

        for (int i=0; i<=n; i++)
            for (int j=0; j<=M; j++) {
                B[i][j] = 0;
            }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                B[i][j] = B[i - 1][j];

                if ((j >= W[i-1]) && (B[i][j] < B[i - 1][j - W[i - 1]] + V[i - 1])) {
                    B[i][j] = B[i - 1][j - W[i - 1]] + V[i - 1];
                }

                System.out.print(B[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Max Value:\t" + B[n][M]);

        System.out.println("Selected Packs: ");

        while (n != 0) {
            if (B[n][M] != B[n - 1][M]) {
                System.out.println("\tPackage " + n + " with W = " + W[n - 1] + " and Value = " + V[n - 1]);

                M = M - W[n-1];
            }

            n--;
        }
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
