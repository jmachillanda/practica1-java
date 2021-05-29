package com.bootcamp.practica3d3T;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int n = arr.length;
        quickSort(arr, 0, n - 1, c);
        printArray(arr, n);
    }

    // A utility function to swap two elements
    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
        the pivot element at its correct position in sorted
        array, and places all smaller (smaller than pivot)
        to left of pivot and all greater elements to right
        of pivot */
    private int partition(T[] arr, int low, int high, Comparator<T> c) {

        // pivot
        T pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (c.compare(arr[j], pivot) < 0) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
                arr[] --> Array to be sorted,
                low --> Starting index,
                high --> Ending index
        */
    private void quickSort(T[] arr, int low, int high, Comparator<T> c) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high, c);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1, c);
            quickSort(arr, pi + 1, high, c);
        }
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
        QuickSortSorterImple<Integer> quickSortSorterImple = new QuickSortSorterImple();
        quickSortSorterImple.sort(arr, Comparator.naturalOrder());
    }

}


