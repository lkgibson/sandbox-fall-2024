package com.sandbox.complexity;

public class BigO {

    public static void main(String[] args) {

        // O(n)
        // O(n) * O(n) = O(n^2)
        int n = 100;
        for(int x = 0; x < n; x++) {
            // O(n)
            for(int y = 0; y < n; y++) {
                System.out.println(x + " " + y);
            }
        }

        // O(n)

        // O(n)

        // O(log n)

        // O(n) + O(n) + O(log n) = O(n) + O(n) = O(n)




    }
}
