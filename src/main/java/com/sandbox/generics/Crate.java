package com.sandbox.generics;

import java.util.ArrayList;
import java.util.List;

public class Crate<T extends Box<?>>
{
    private List<T> containers;

    public Crate()
    {
        containers = new ArrayList<>();
    }

    public void addBox(T box)
    {
        containers.add(box);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Crate{");
        sb.append("containers=").append(containers);
        sb.append('}');
        return sb.toString();
    }
}
