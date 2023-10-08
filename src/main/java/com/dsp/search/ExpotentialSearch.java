package com.dsp.search;


/*
1. iterate in the multiple of 2 and check if i is lesser than upper bound and array value at i is less than the target value
2. if create a binary search for the reminder of the array.
 */
public class ExpotentialSearch {

    public static void main(String[] args) {
        int array[] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int value = 21;

        ExpotentialSearch es = new ExpotentialSearch();
        System.out.println(es.expotentialSearch(array, value));
    }

    private int expotentialSearch(int[] array, int value) {
        int i=1;
        int lower_bound = 0;
        int upper_bound = array.length;
        if(array[lower_bound]==value) return lower_bound;
        while(i<upper_bound && array[i]<value){
            i*=2;
        }

        return binarySearch(array,i/2,Math.min(i,upper_bound),value);
    }

    private int binarySearch(int[] array, int i, int min, int value) {
        int lower_bound = i;
        int upper_bound = min;

        while(lower_bound<=upper_bound){
            int mid = lower_bound+(upper_bound-lower_bound)/2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] <= value) {
                upper_bound = mid;
            } else {
                lower_bound = mid;
            }

        }

        return -1;
    }
}
