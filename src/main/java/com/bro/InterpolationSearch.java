package com.bro;

/*
    1. loop while target greater than or equal to value at first index and
         target is lesser than or equal to value at last index and
         lower bound is lesser than or equal to higher bound
    2. Calculate probe  using formula lower bound + ( higher bound - lower bound) + (target - value at lower bound)/(val of higher - val of lower bound
    3. if the probe is equal to target exit and return the index
    4. if probe is greater than target , make lower bound as probe +1
    5. if probe is lesse than target, make the higher bound as probe i1;

 */
public class InterpolationSearch {

    int array[] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
    int value = 21;

    public int interpolationSearch(int[] arr, int target) {
        int low = 0, high = array.length-1;

        while (arr[low] <= target && arr[high] >= target && low <= high) {

            int probe = low + (high - low) *  (target - arr[low]) / (arr[high] - arr[low]);
            System.out.println(probe);
            if (target == arr[probe]) {
                return probe;
            } else if (target < arr[probe]) {
                high = probe - 1;
            } else {
                low = probe + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        InterpolationSearch is = new InterpolationSearch();
        int index = is.interpolationSearch(is.array, is.value);

        if (index != -1) {
            System.out.println("Target found at " + index);
        } else {
            System.out.println("Target not found.");
        }
    }
}
