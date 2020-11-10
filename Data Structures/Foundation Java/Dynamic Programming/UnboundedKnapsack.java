// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/unbounded-knapsack-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        int capacity = sc.nextInt();

        int[] dp = new int[capacity + 1];
        dp[0] = 0;

        for (int bagCapacity = 1; bagCapacity <= capacity; bagCapacity++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (weights[i] <= bagCapacity) {
                    int remainingBagCapacity = bagCapacity - weights[i];
                    int remainingBagValue = dp[remainingBagCapacity];
                    int totalBagValue = remainingBagValue + values[i];

                    if (totalBagValue > max) {
                        max = totalBagValue;
                    }
                }
            }
            dp[bagCapacity] = max;
        }
        System.out.println(dp[capacity]);
    }
}