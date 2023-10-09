package com.dsp.sort;

import java.util.Arrays;

/*
1. Pick a pivot and usually it is the last element
2. Need to identify the position of the pivot
3. Need to arrange the element in array in such a way that pivot should be placed in its place and right of pivot should be great
   and left of pivot is less
 */


// quick sort = moves smaller elements to left of a pivot.
//     recursively divide array in 2 partitions

// run-time complexity = Best case O(n log(n))
//                                        Average case O(n log(n))
//                                        Worst case O(n^2) if already sorted

// space complexity    = O(log(n)) due to recursion
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {8,2,4,7,1,3,9,6,5};
        QuickSort qs = new QuickSort();
        qs.print(array);
        qs.sort(array,0,array.length-1);
        qs.print(array);

    }

    private void sort(int[] array, int start, int end) {

        //base case
        if(end<=start) return;

        int pivot = partition(array,start,end);
        sort(array,start,pivot-1);
        sort(array,pivot+1,end);
        
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start-1;

        //continue to swap all element which are less than pivot to the left
        // and elements greater than pivot to the right.
        for (int j = start; j < end; j++) {
            if(array[j]<pivot){
                i++;
                swap(array,j,i);
            }
            print(array);
        }
        i++;
        swap(array,end,i);

        return i;
    }

    private void swap(int[] array, int j, int i) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void print(int[] array) {
        Arrays.stream(array).forEach(val-> System.out.print(val+" "));
        System.out.println();
    }


}
