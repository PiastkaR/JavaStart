package com.javastart.generictypes.pair;

public class Pair<T, V> {
    private T typeTInstance;
    private V typeVInstance;

    public Pair(T typeTInstance, V typeVInstance) {
        this.typeTInstance = typeTInstance;
        this.typeVInstance = typeVInstance;
    }

    public <T, V> void printInfo(Pair<T, V> pair) {
        System.out.println("T: " + pair.getTypeTInstance() + " V: " + pair.getTypeVInstance());
    }

    public T getTypeTInstance() {
        return typeTInstance;
    }

    public void setTypeTInstance(T typeTInstance) {
        this.typeTInstance = typeTInstance;
    }

    public V getTypeVInstance() {
        return typeVInstance;
    }

    public void setTypeVInstance(V typeVInstance) {
        this.typeVInstance = typeVInstance;
    }

//    @Override
//    public String toString() {
//        return "T: " + typeTInstance + " V: " + typeVInstance;
//    }
}
