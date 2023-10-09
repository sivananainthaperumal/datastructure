package com.dsp.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int array1[] = {2,5,23,32,78};
        int array2[] = {3,7,30,31,43,59};

        MergeSort ms = new MergeSort();
        int array3[] = ms.merge(array1,array2);
        ms.print(array3);
    }

    private int[] merge(int[] array1, int[] array2) {

        int i=0;
        int j=0;
        int k=0;
        int arr[] = new int[array1.length+array2.length];
        while(i<array1.length && j< array2.length){
            if(array1[i]<array2[j]){
                arr[k]=array1[i];
                i++;k++;
            }else if(array1[i]>array2[j]){
                arr[k]=array2[j];
                j++;k++;
            }else if (array1[i]==array2[j]){
                arr[k]=array1[i];
                i++;k++;
                arr[k]=array2[j];
                j++;k++;
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
    }
}
