package com.javastart.internalclasses.localclasses;

class Outer {
    private int x;

    public void doSometing() {
        int localVar = 5;

        class Inner {
            public void innerMethod() {
                x = 5;
                System.out.println(localVar);
            }
        }
    }
}