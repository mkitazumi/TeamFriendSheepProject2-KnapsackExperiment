package Knapsack01;


import General.Reader;
import General.knapsack;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //Reader
        Reader read = new Reader();
        // Method Greedy Knapsack 0/1
        Greedy greedy = new Greedy();

//        int[] input1 = read.load(new File("Project2/src/InputFiles/inputs.csv"));
//        knapsack knap = new knapsack();
//        knap.load(input1);
//        knap.display();
//
//        int[] input2 = read.load(new File("Project2/src/InputFiles/inputs2.csv"));
//        knapsack knap2 = new knapsack();
//        knap2.load(input2);
//        knap2.display();

        // load data from CSV into new array
        int[] input3 = read.load(new File("Project2/src/InputFiles/inputs3.csv"));
        // Initialize object Knapsack
        knapsack knap3 = new knapsack();
        // load data from array into knapsack
        knap3.load(input3);
        // display knapsack
        knap3.display();
        // Initialize variable to store result
        // run function with name.run(knapsack)
        int result3 = greedy.run(knap3);
        // print out result
        System.out.println(result3);

    }
}
