package com.sandbox.exception;

import java.util.Scanner;

public class HelloException
{
    public static void main(String[] args)
    {

        //try-catch
        try
        {
            // do something
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //try-catch-catch - order of catch blocks matters per hierachy
        try
        {
            // do something
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //try-catch-finally
        try
        {
            // do something
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            // finally do something
        }

        try
        {
            // do something
        }
        finally
        {
            // do something
        }

        // java 7 multi-try-catch
        try
        {
            // do something
        }
        catch (ArithmeticException | NullPointerException e)
        {
            e.printStackTrace();
        }

        // try-with-resources
        try (Scanner scanner1 = new Scanner(System.in))
        {
            // do something
        }

        Scanner scanner2 = null;
        try
        {
            scanner2 = new Scanner(System.in);
        }
        finally
        {
            if (scanner2 != null)
            {
                scanner2.close();
            }
        }

        try (Scanner scanner3 = new Scanner(System.in))
        {
            // do something
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
