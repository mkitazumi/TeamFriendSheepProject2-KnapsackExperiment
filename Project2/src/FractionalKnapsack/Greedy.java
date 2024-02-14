package FractionalKnapsack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy {

    public void run(int capacity, int[] weight, int[] value) {
        //Int variable to hold our weight. Array to hold our items, double to hold our profit, and an array for ratios
        int length = weight.length;
        FKnapsack order = new FKnapsack();
        FKnapsack[] list = new FKnapsack[length];
        double profit = 0;
        ArrayList<Integer> itemSelected = new ArrayList<>();
        int capcityLeft = capacity;

        for (int index = 0; index < weight.length; index++) {

            FKnapsack temp = new FKnapsack();
            temp.setValue(value[index]);

            double ratioTemp = value[index] / weight[index];
            temp.setRatio(ratioTemp);

            temp.setTitle(index);
            temp.setWeight(weight[index]);

            list[index] = temp;

        }


        //Sorts the items array in desecending order based on ratios. + Converts integers into doubles
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i].getRatio() < list[i + 1].getRatio()) {
                FKnapsack temp = new FKnapsack();
                temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
            }

        }

        while (capcityLeft > 0) {
            for (FKnapsack e : list) {
                if (e.getWeight() <= capcityLeft && !itemSelected.contains(e.getTitle())) {
                    profit += e.getValue();
                    capcityLeft -= e.getWeight();
                    itemSelected.add(e.getTitle());

                } else {
                    profit += capcityLeft * e.getRatio();
                    capcityLeft = 0;
                    itemSelected.add(e.getTitle());
                }

                for (int i : itemSelected) {
                    System.out.println("Item's Selected: ");
                    System.out.print(i + ", \n");


                }
            }

        }

        System.out.println("Total Profit = " + profit);
    }

}