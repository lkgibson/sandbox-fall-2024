package com.sandbox.exception;

public class DivideByZeroException extends Exception
{
    public DivideByZeroException()
    {
    }
    public DivideByZeroException(String message)
    {
        super(message);
    }
    public DivideByZeroException(String message, Throwable cause)
    {
        super(message, cause);
    }
}

