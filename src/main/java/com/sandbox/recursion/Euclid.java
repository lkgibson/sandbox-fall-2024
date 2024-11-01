package com.sandbox.recursion;

public class Euclid
{

    public static void main(String[] args)
    {
        System.out.println(gcd(10, 5));
        System.out.println(gcd2(10, 5));
        System.out.println(gcd3(10, 5));
    }

    /*
    function gcd(a,b)
    while b ≠ 0
    t := b
    b := a mod b
    a := t
    return a
     */

    public static int gcd(int a, int b)
    {
        while (b != 0)
        {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    /*
    function gcd(a,b)
    while a ≠ b
    if a > b
    a := a - b
    else
    b := b - a
    return a
     */

    // subtraction-based Euclidean algorithm

    public static int gcd2(int a, int b)
    {
        while (a != b)
        {
            if (a > b)
            {
                a = a - b;
            } else
            {
                b = b - a;
            }
        }
        return a;
    }

    /*
    function gcd(a,b)
    if b = 0
    return a
    else
    return gcd(b, a mod b)
     */

    // recursive Euclidean algorithm
    public static int gcd3(int a, int b)
    {
        if (b == 0)
        {
            return a;
        } else
        {
            return gcd3(b, a % b);
        }
    }
}
