package com.bootcamp.practica3d3T;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    T aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
        printArray(arr, arrayLength);
    }

    // Function to print an array
    private void printArray(T[] arr, int size) {
        System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String[] args) {
        Integer[] arr = {10, 7, 8, 9, 1, 5};
        BubbleSortSorterImple<Integer> bubbleSortSorterImple = new BubbleSortSorterImple();
        bubbleSortSorterImple.sort(arr, Comparator.naturalOrder());
    }
}


