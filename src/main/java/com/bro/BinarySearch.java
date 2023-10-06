package com.bro;

import java.util.Arrays;

public class BinarySearch {

    static int array[] = new int[100000];
    static int target = 4200;

    static {
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
    }


    private int binarySearch(int[] array, int target) {
        int low = 0, high =array.length, mid;

        while(low<=high){
            mid=(low+high)/2;
            System.out.println("Mid is "+mid);
            if(target<=mid){
                high=mid;
            }else if(target>mid && target<high) {
                low=mid;

            }else
                return -1;

            if(mid==target)return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        //int index = Arrays.binarySearch(array,target);

        BinarySearch bs = new BinarySearch();

        int index = bs.binarySearch(array,target);
        if(index!=-1){
            System.out.println("Target found at index "+index);
        }
    }

}

/*
1. Initialize low, mid to default, high to array length
1.5 loop till low is less than high
2. calculate the mid by adding low and high and divide by 2.
3. if target is less than mid, assign mid to high
4. if target is greater than mid, assign mid to low.
 */