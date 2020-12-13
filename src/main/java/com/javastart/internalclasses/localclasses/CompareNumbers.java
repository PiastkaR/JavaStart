package com.javastart.internalclasses.localclasses;

class CompareNumbers {
    public static void main(String[] args) {
        BiggestNumber nc = new BiggestNumber() {
            @Override
            public int takeBiggest(int[] tab) {
                if (tab == null)
                    throw new NullPointerException("argument cannot be null");
                if (tab.length == 0)
                    throw new IllegalArgumentException("array has to have at least 1 value");

                int biggestNumber = tab[0];
                for (int i = 1; i < tab.length; i++) {
                    if (biggestNumber < tab[i]) {
                        biggestNumber = tab[i];
                    }
                }
                return biggestNumber;
            }
        };

        int[] tab = {5, 10, -8, -23, 1009, 2938, 153, 24};
        System.out.println("Największa z liczb to: " + nc.takeBiggest(tab));
    }
}
