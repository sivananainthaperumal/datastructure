package com.bro;

public class LinearSearch {

    int[] array = {1,4,6,3,9,12,7};

    private int linearSearch(int[] array, int i) {

        for (int j = 0; j < array.length; j++) {
            if(array[j]==i){
                return j;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        LinearSearch bs = new LinearSearch();
        System.out.println(bs.linearSearch(bs.array, 90));
    }
}
