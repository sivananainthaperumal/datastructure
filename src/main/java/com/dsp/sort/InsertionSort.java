package com.dsp.sort;

import java.util.Arrays;
/*
1. Iterate first loop from second idx
2. Iterate the second loop from first idx to current idx of first loop.
3. compare if first loop array idx with the element of the second loop, if less swap otherwise ignore

 Time Complexity -
    Worst case - O(n^2)
    Avg case   - O(n^2)
    Best Case  - O(n^2)

 Space Complexity - O(1)
 */

public class InsertionSort {

    public static void main(String[] args) {
        int array[] = {2,5,23,1,6,3,67,9,32};

        InsertionSort is = new InsertionSort();
        is.print(array);
        is.sort(array);
        is.print(array);
    }

    private void sort(int[] array) {

        int n= array.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(array[i]<array[j]){
                    int temp = array[j];
                    array[j]=array[i];
                    array[i] =temp;
                }
            }
        }
    }

    private void print(int[] array) {
        Arrays.stream(array).forEach(val-> System.out.print(val+" "));
        System.out.println();
    }


}
