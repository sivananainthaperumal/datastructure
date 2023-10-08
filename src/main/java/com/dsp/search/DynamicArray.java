package com.dsp.search;

public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] elements= new Object[10];

    public DynamicArray(){
    }

    public DynamicArray(int capacity){
        this.capacity=capacity;
    }

    public int getSize(){
        return size;
    }

    public Object getValue(int index){
        return elements[index];
    }
    public void add(Object value){
        if(size<capacity){
            elements[size]=value;
        }
        size++;
    }

    public Object remove(){

        Object val;
        if(size>0) {
            val = elements[size];
            elements[size] = null;
            size--;
        }else {
            val = null;
        }
        return val;
    }


    public void insertAt(int index, Object val){

        if(index==size){
            add(val);
        }else if(index<size){
            size++;
            for(int i=size;i>index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=val;
        }else {
            System.out.println("Can't be inserted ...");
        }
    }

    public void removeAt(int index){
        if(size==index){
            remove();
        }else if(index<size){
            for(int i=index;i<size;i++){
                elements[i]=elements[i+1];
            }
            size--;
        }else {
            System.out.println("Can't be removed ...");
        }
    }

    public boolean delete(Object val){
        for(int i=0;i<=size;i++){
            if(elements[i]==val){
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int search(Object val){
        for(int i=0;i<=size;i++){
            if(elements[i]==val){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String str = new String();
        for(int i=0;i<size;i++){
            str+=(elements[i])+",";
        }

        return str;
    }


    public static void main(String[] args) {
/*
        DynamicArray dynamicArray = new DynamicArray(20);

        System.out.println(dynamicArray.capacity);

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
*/
/*      dynamicArray.remove();
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);*//*


        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
*/


    }
}
