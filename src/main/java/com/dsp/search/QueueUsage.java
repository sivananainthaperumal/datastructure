package com.dsp.search;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsage {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        for(int i=1;i<5;i++){
            queue.offer("queue item "+i);
        }

        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println(queue);
    }
}
