package com.dsp.search;

import java.sql.SQLOutput;
import java.util.Stack;

public class StackUsage {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        for(int i=0;i<5;i++){
            stack.push("stack item "+i);
        }

        System.out.println(stack.peek());

        System.out.println(stack);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
