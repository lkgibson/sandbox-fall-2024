package com.sandbox.generics;

public class Box<T extends Number>
{
    private T contents;

    public Box()
    {

    }

    public T getContents()
    {
        return contents;
    }
    public void setContent(T contents)
    {
        this.contents = contents;
    }

    @Override
    public String toString()
    {
    final StringBuilder sb = new StringBuilder("Box{");
    sb.append("contents=").append(contents);
    sb.append('}');
    return sb.toString();
    }
}
