package com.bridgelabz.hashtable;


public class MyLinkedList<K,V> {

    MyNode<K,V> head;
    MyNode<K,V> tail;


    public void push(K key,V value) {
        MyNode<K,V> newNode = new MyNode(key,value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(K key,V value) {
        MyNode<K,V> newNode = new MyNode(key,value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public MyNode<K,V> pop(){
        MyNode<K,V> popData = head;
        head = head.next;
        return popData;
    }

    public void display() {
        MyNode<K,V> temp = head;
        while (temp != null) {
            System.out.print(temp.key +"," + temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public MyNode<K,V> popLast() {
        MyNode<K,V> popData = tail;
        MyNode<K,V> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
    }

    public MyNode<K,V> search(K searchData) {
        MyNode<K,V> temp = head;
        while (temp != null) {
           if(temp.key.equals(searchData))
               return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(K insertData, K searchData) {
       MyNode<K,V> searchedData =  search(searchData);
       if(searchedData != null){
           MyNode<K,V> newNode = new MyNode(insertData,1);
           MyNode<K,V> nextNode = searchedData.next;
           searchedData.next = newNode;
           newNode.next = nextNode;
           return true;
       }
       return false;
    }

    @Override
    public String toString() {
        return " \n{" + head + "}";
    }
}
