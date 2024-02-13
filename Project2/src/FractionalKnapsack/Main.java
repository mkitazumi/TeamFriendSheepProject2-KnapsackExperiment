package FractionalKnapsack;
import General.Reader;
import General.knapsack;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Reader read = new Reader();
        Greedy greedy = new Greedy();

        int[] input1 = read.load(new File("Project2/src/InputFiles/inputs.csv"));
        knapsack knap = new knapsack();
        knap.load(input1);

        int[] input2 = read.load(new File("Project2/src/InputFiles/inputs2.csv"));
        knapsack knap2 = new knapsack();
        knap2.load(input2);

        int[] input3 = read.load(new File("Project2/src/InputFiles/inputs3.csv"));
        knapsack knap3 = new knapsack();
        knap3.load(input3);

//         To be added later once inputs are added.
//        int[] input4 = read.load(new File("Project2/src/InputFiles/inputs3.csv"));
//        knapsack knap4 = new knapsack();
//        knap4.load(input4);
//
//        int[] input5 = read.load(new File("Project2/src/InputFiles/inputs3.csv"));
//        knapsack knap5 = new knapsack();
//        knap5.load(input5);
//
//        int[] input6 = read.load(new File("Project2/src/InputFiles/inputs3.csv"));
//        knapsack knap6 = new knapsack();
//        knap6.load(input6);

        System.out.println("Greedy Fractional Knapsack Results:");
        //Input 1
        knap.display();
        greedy.run(knap.getCapacity(), knap.getWeight(),knap.getValue());

        //Input 2
        knap2.display();
        greedy.run(knap2.getCapacity(), knap2.getWeight(),knap2.getValue());

        //Input 3
        knap3.display();
        greedy.run(knap3.getCapacity(), knap3.getWeight(),knap3.getValue());

        //Input 4
        //Input 5
        //Input 6
    }
}