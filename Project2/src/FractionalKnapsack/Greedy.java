package FractionalKnapsack;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {

    public void run(int capacity, int[] weight, int[] value){
        //Int variable to hold our weight. Array to hold our items, double to hold our profit, and an array for ratios
        int length = weight.length;
        itemArray[] items = new itemArray[length];
        int[] ratio = new int[length];
        double profit = 0;

        int itemName = 0;
        //For loops that calculates our ratios + inserts our weight, values, and ratios into an item array.
        for(int index = 0; index < length; index++ ){
            itemName += 1;
            ratio[index] = value[index]/weight[index];
            items[index] = new itemArray(itemName, weight[index], value[index], ratio[index]);

        }

        //Sorts the items array in desecending order based on ratios. + Converts integers into doubles
        Arrays.sort(items, Comparator.comparing((itemArray item) -> item.ratio).reversed());


            //Iterates through our item arrays.
            for (itemArray total : items) {
                //If the capacity is greater or equal to our current weight we add the value and - the weight from capcity.
                if (capacity >= total.weight) {

                    profit += total.value;
                    capacity -= total.weight;

                    System.out.println("Item " + total.itemName + " added.");
                    System.out.println("Current Profit: " + profit);
                    System.out.println("Current capacity: " + capacity + "\n");

                }
                //If the item's weight is too large for the weight capacity of the sack. We fraction the item added and break the loop.
                else {

                    profit += (total.ratio * capacity);

                    System.out.println("Fraction of Item " + total.itemName + " added.");
                    System.out.println("Current capacity: " + capacity + "\n");
                    break;
                }
            }

        System.out.println("Total Profit = " + profit);
    }


}



