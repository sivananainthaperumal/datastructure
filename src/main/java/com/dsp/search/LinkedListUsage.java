package com.dsp.search;

import java.util.LinkedList;

public class LinkedListUsage {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i=1;i<6;i++){
            linkedList.offer(""+i); // queue
            //linkedList.push(""+i); stack

        }

        System.out.println(linkedList);

        linkedList.addFirst("0");
        linkedList.addLast("7");

        System.out.println(linkedList);

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

        System.out.println(linkedList.contains("1"));
    }
}
