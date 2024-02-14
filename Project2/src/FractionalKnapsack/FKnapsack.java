package FractionalKnapsack;

public class FKnapsack {
    private int weight;
    private int value;
    private int title;
    private int ratio;
    private int capacity;

    public FKnapsack() {
    }

    public void Fknapsack(int title, int weight, int value, int ratio) {
        this.weight = weight;
        this.value = value;
        this.ratio = ratio;
        this.title = title + 1;
    }

    public void Fknapsack(int[] array) {
        this.title = array[0];
    }

    public void Fknapsack(int title, int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = 0;
        this.title = title + 1;
    }

    public void setTitle(int title) {
        this.title = title + 1;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRatio(double ratioTemp) {
        this.ratio = this.ratio;
    }

    public int getTitle() {
        return this.title;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getValue() {
        return this.value;
    }

    public double getRatio() {
        return (double)this.ratio;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
