package Knapsack01;


import General.Reader;
import General.knapsack;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Bruteforce test = new Bruteforce();
        int title = -1;
        int capacity = 9;
        int[] weight = {3, 2, 6, 4, 1};
        int[] value = {16, 17, 19, 22, 11};
        int total = test.bruteforce(title,capacity, weight, value);
        System.out.println(total);
        Reader read = new Reader();
        int[] input1 = read.load(new File("Project2/src/InputFiles/inputs.csv"));
        knapsack knap = new knapsack();
        knap.load(input1);
        knap.display();

        int[] input2 = read.load(new File("Project2/src/InputFiles/inputs2.csv"));
        knapsack knap2 = new knapsack();
        knap2.load(input2);
        knap2.display();

        int[] input3 = read.load(new File("Project2/src/InputFiles/inputs3.csv"));
        knapsack knap3 = new knapsack();
        knap3.load(input3);
        knap3.display();

        int resultInput2 = test.bruteforce(knap2.getTitle(),knap2.getCapacity(), knap2.getWeight(), knap2.getValue());
        System.out.println("Total profit is " + resultInput2);
    }
}
