package com.evensgn.emcompiler.ir;

public abstract class StaticData extends IRRegister {
    String name;
    int size;

    public StaticData(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}