package com.dsp.search;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueUsage {

    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue<>(/*Collections.reverseOrder()*/);

        for (Double d = 1.0;d<5.0;d++){
            queue.offer(d);
        }

        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
