package FractionalKnapsack;

public class itemArray{
     int weight;
    int value;
    int ratio;

    int itemName;

    public itemArray(int itemName, int weight, int value, int ratio){
        this.weight = weight;
        this.value = value;
        this.ratio = ratio;
        this.itemName = itemName;
    }

}