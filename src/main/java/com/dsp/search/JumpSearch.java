package com.dsp.search;


/*
1. Calculate jump value, it is the sqrt of the length of the array.
2. when target is greater than both low and high, increment both low and high
3. when target is greater than low and less than high or last element, increment the low one by one and compare the value against target
4. if it matches the target return the index else return -1.
 */
public class JumpSearch {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 12;
        JumpSearch js = new JumpSearch();
        int idx = js.jumpSearch(arr,12);
        if(idx!=-1) System.out.println("Target is found :"+idx);
        else System.out.println("Target not found.");
    }

    private int jumpSearch(int[] arr, int target) {

        int jump = (int) Math.sqrt(arr.length);
        int iterator=0;
        int low = 0;
        int high = jump;

        while(target >low && target >high && high < arr.length){
            low+=jump;
            high+=jump;
            System.out.println("jump -"+iterator++);
        }

        while(low<target && low<=arr.length){
            if (arr[low] == target) {
                return low;
            } else {
                low++;
            }
        }
        return -1;

    }
}
