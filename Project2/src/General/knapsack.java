package General;

public class knapsack {
    private int title;
    private int capacity;
    private int[] weight;
    private int[] value;
    private int[] original;


    // Load with 1 argument
    public void load(int[] input){
        title = input[0];
        capacity = input[1];
        int startIndex = 2;
        int endIndex = input.length;

// Calculating midpoint using startIndex and endIndex
        int midpoint = (startIndex + endIndex) / 2;

// Initializing arrays
        original = new int[input.length];
        value = new int[midpoint - startIndex];
        weight = new int[endIndex - midpoint];

// Copying values from input to the respective arrays
        System.arraycopy(input, 0, original, 0, input.length);
        System.arraycopy(input, startIndex, value, 0, midpoint - startIndex);
        System.arraycopy(input, midpoint, weight, 0, endIndex - midpoint);
    }

    // Load with 3 arguments
    public void load(int capacity, int[] weight, int[] value){
        this.capacity = capacity;
        this.weight = weight;
        this.value = value;
    }

    // Load with 4 arguments
    public void load(int title, int capacity, int[] weight, int[] value){
        this.title = title;
        this.capacity = capacity;
        this.weight = weight;
        this.value = value;
    }




    public void display(){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Capacity: " + capacity);
        System.out.println("Weight: ");
        for(int e : weight){
            System.out.print(e + " | ");
        }
        System.out.println("\nValue: ");
        for(int v : value){
            System.out.print(v + " | ");
        }
        System.out.println("\n-----------------------------------------------------------------------------------");

    }

    public int getTitle(){
        return  this.title;
    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getWeight() {
        return weight;
    }

    public int[] getValue() {
        return value;
    }

    public int[] getOriginal() {
        return original;
    }
}
