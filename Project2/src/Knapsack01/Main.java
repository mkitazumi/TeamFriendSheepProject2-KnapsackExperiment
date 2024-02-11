package Knapsack01;

public class Main {
    public static void main(String[] args) {
        Bruteforce test = new Bruteforce();
        int capacity = 9;
        int[] weight = {3, 2, 6, 4, 1};
        int[] value = {16, 17, 19, 22, 11};
        int total = test.bruteforce(capacity, weight, value);
        System.out.println(total);
    }
}
