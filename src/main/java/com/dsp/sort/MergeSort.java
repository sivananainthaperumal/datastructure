package com.dsp.sort;

import java.util.Arrays;

/*
 Time Complexity -
    Worst case - O(n log n)
    Avg case   - O(n log n)
    Best Case  - O(n log n)

 Space Complexity - O(n)
 */
public class MergeSort {

    public static void main(String[] args) {

        int array[] = {2,5,3,32,78,9};

        MergeSort ms = new MergeSort();

        ms.print(array);
        ms.mergeSort(array);
        ms.print(array);
    }

    /*
    Divide and conquer
    1. Divide the array into two and initialize the values from the original
    2. Call mergeSort recursively to the leftArray and rightArray and then merge them
     */
    private void mergeSort(int[] array){
        int length= array.length;
        if(length<=1) return;
        int mid = length/2;
        int[] lArray = new int[mid];
        int[] rArray = new int[length-mid];


        for (int i = 0,j=0; i < length;i++) {
            if(i<mid) {
                lArray[i] = array[i];
            }else{
                rArray[j++]=array[i];
            }
        }


        mergeSort(lArray);
        mergeSort(rArray);
        merge(lArray,rArray,array);

    }

    /*
    1. Initialize three pointer, each pointing to their first indices of their respective array.
    2. Compare the array element between the first and second array and copy the smallest one to the third array and increment the indices of the array from which it is copied
    3. If any array's end is reached iterate the other array and copy rest of the element.
     */
    private int[] merge(int[] array1, int[] array2, int[] arr) {

        int i=0, j=0, k=0;

        while(i<array1.length && j< array2.length){
            if(array1[i]<array2[j]){
                arr[k++]=array1[i++];
            }else if(array1[i]>array2[j]){
                arr[k++]=array2[j++];
            }else if (array1[i]==array2[j]){
                arr[k++]=array1[i++];
                arr[k++]=array2[j++];
            }
        }

        if(k<arr.length && i==array1.length){
            for (int l = j; l < array2.length; l++,k++) {
                arr[k]=array2[l];
            }
        }else if ( k<arr.length && j==array2.length)
        {
            for (int l = i; l < array1.length; l++,k++) {
                arr[k]=array1[l];
            }
        }

        return arr;
    }

    private void print(int[] array3) {
        Arrays.stream(array3).forEach(val-> System.out.print(val+ " "));
        System.out.println();
    }
}
