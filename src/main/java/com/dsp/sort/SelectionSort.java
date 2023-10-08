package com.dsp.sort;

import java.util.Arrays;

/*
1. double iterating the array.
2. first iteration the first the starting index
3. Second iteration starts after the sorted index
4. After every iteration left idx is sorted
5. For every iteration swap the index(i) with the min of the rest of the array.

 Time Complexity -
    Worst case - O(n^2)
    Avg case   - O(n^2)
    Best Case  - O(n^2)

 Space Complexity - O(1)
 */
public class SelectionSort {

    public static void main(String[] args) {

        int array[] = {2,5,23,1,6,3,67,9,32};
        SelectionSort ss = new SelectionSort();
        ss.print(array);
        ss.sort(array);
        ss.print(array);
    }

    private void sort(int[] array) {

        int n= array.length;
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i; j < n; j++) {
                if(array[minIdx]>array[j]){
                    minIdx=j;
                }
            }
            int temp = array[minIdx];
            array[minIdx]=array[i];
            array[i]=temp;

        }
    }


    private void print(int[] array) {
        Arrays.stream(array).forEach(val-> System.out.print(val+" "));
        System.out.println();
    }

}
