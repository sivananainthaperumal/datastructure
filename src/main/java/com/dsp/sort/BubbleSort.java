package com.dsp.sort;

import java.util.Arrays;

/*
 1. Iterate decrement of j from n to o.
 2. Iterate increment of i to j
 3. Every iteration will leave the last element sorted.
 Time Complexity -
    Worst case - O(n^2)
    Avg case   - O(n^2)
    Best Case  - O(n)

 Space Complexity - O(1)

 */
public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {2,5,23,1,6,3,67,9,32};

        BubbleSort bs = new BubbleSort();
        bs.print(array);
        bs.sort(array);
        bs.print(array);
    }

    private void sort(int[] array) {
        System.out.println("Bubble Sort");
        int n= array.length-1;
        System.out.println(n);
        for (int j = n; j >0 ; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    private void print(int[] array){
        Arrays.stream(array).forEach(val->System.out.print(val+" "));
    }
}
