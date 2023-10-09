package com.dsp.sort;

// Heap Sort in Java
/*
1. build the heap by iterating through the height it is calculated as n/2 -1, iterate in descending order
2. pass to the utility method to heapify
3. iterate the whole array in the descending order and swap it with 0 and i
4. run through heapify again with i, 0.
5.  heapify calculate
   get parent - i, left - > 2*i+1, right -> 2*i+2
   if parent is not the largest, swap it with largest swap(arr, i,largest)
   recursively heapify the array.
 */
import java.util.Arrays;

public class HeapSort {

    public void sort(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            swap(arr,i,0);

            // Heapify root element
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[left]> arr[largest]){
            largest=left;
        }

        if(right<n && arr[right]> arr[largest]){
            largest=right;
        }

        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,n,largest);

        }
    }

    private void swap(int[] arr, int i, int i1) {
        int temp = arr[i1];
        arr[i1]=arr[i];
        arr[i]=temp;
    }


    // Function to print an array
    private void print(int arr[]) {
        Arrays.stream(arr).forEach(val-> System.out.print(val+ " "));
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 1, 12, 9, 5, 6, 10 };

        HeapSort hs = new HeapSort();
        hs.print(arr);
        System.out.println("Sorted array is");
        hs.print(arr);
    }
}

