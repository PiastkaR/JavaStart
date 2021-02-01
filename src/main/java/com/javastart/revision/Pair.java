package com.javastart.revision;

public class Pair<T, V> {
    private T field1;
    private V field2;

    public Pair(T field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public V getField2() {
        return field2;
    }

    public void setField2(V field2) {
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }
}
