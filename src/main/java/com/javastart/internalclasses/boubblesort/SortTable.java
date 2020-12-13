package com.javastart.internalclasses.boubblesort;

public class SortTable {
    public static void main(String[] args) {
        int tab[] = {1, 2, 3, -12, -15, 456, 534534, 8, 0};

        BubbleSort bn = new BubbleSort() {
            @Override
            public int[] bubbleSort(int[] tab) {
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 1; j < tab.length - i; j++) {
                        if (tab[j - 1] > tab[j]) {
                            int number = tab[j];
                            tab[j] = tab[j - 1];
                            tab[j - 1] = number;
                        }
                    }
                }
                return tab;
            }
        };

        int[] sorted = bn.bubbleSort(tab);
        for (int element : sorted) {
            System.out.println(element + " ");
        }
    }
}
