package com.example.linkedlist.single;

public class SingleLinkedList {

    private Node head;
    private int nodeCount=0;

    public SingleLinkedList(){

    }

    public SingleLinkedList(int data){
        head = new Node(data,null);
    }

    public static void main(String []args){
        SingleLinkedList sll = new SingleLinkedList(1);
        sll.insert(0,0);
        sll.insert(2,3);
        sll.traverse();
        sll.delete(1);
        sll.traverse();
        //System.out.println(sll.getNodeCount());
    }
    public boolean insert(int data, int location){

        boolean isInserted = true;

        try {
            if (head != null) {
                if (location==0){
                    Node tempNode =head;
                    Node node = new Node(data);
                    node.setNext(tempNode);
                    head =node;
                }else if( location> getNodeCount()){
                    Node index = head;
                    while(index.hasNext()){
                        index=index.getNext();
                    }
                    index.setNext(new Node(data));
                }else {
                    Node index = head;
                    int i=1;
                    while(index.hasNext()){
                        i++;
                        if(location==i){
                            Node node = new Node(data,index.getNext());
                            index.setNext(node);
                        }
                        index=index.getNext();
                    }
                    index.setNext(new Node(data));
                }
            } else {
                head = new Node(data);
            }
        }catch(Exception e){
                isInserted =false;
            }
        return isInserted;
    }

    public boolean delete(int data){
        Node prevNode = head;
        Node index = prevNode.getNext();
        if(prevNode.getData()==data){
            head =prevNode.getNext();
            return true;
        }else {
            while (index.hasNext()) {
                if (index.getData() == data) {
                    prevNode.setNext(index.getNext());
                    return true;
                }
                prevNode = index;
                index = index.getNext();
            }
        }
        return true;
    }

    private void traverse(){
        Node index = head;
        System.out.print(index.getData());
        while(index.hasNext()){
            index=index.getNext();
            System.out.print("->"+index.getData());
        }
        System.out.println("\n");
    }

    private int getNodeCount(){
        Node index = head;
        nodeCount++;
        while(index.hasNext()){
            index=index.getNext();
            nodeCount++;
        }
        System.out.println("Count :"+nodeCount);
        return nodeCount;

    }
}
