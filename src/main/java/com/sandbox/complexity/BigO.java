package com.sandbox.complexity;

public class BigO
{
    public static void main(String[] args)
    {
        // 0(n)
        // 0(n) * 0(n) = 0(n^2)
        int n = 100;
        for(int x = 0; x < n /2; x++)
        // 0(n)
        {
            for(int y = 0; y < n; y++)
            {
                System.out.println(x + " " + y);
            }
        }

        // 0(n)

        // 0(n)

        // 0(log n)

        // 0(n) + 0(n) + 0(log n) = 0(n) + 0(n) = 0(n)
    }
}
