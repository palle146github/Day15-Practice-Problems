package com.bridgelabz.hashtable;

import java.util.ArrayList;


public class HashTable<K, V> {

    int myBucketSize;

    ArrayList<MyLinkedList> myBucketArray;

    public HashTable() {

    }

    public HashTable(int myBucketSize) {
        this.myBucketSize = myBucketSize;
        this.myBucketArray = new ArrayList<>();
        for (int i = 0; i < myBucketSize; i++) {
            this.myBucketArray.add(null);
        }
    }

    int getIndex(K key) {
        int index = Math.abs(key.hashCode()) % myBucketSize;
        return index;
    }

    public V get(K word) {
        int index = getIndex(word);
        MyLinkedList<K, V> myLinkedList = myBucketArray.get(index);
        if (myLinkedList == null) {
            return null;
        } else {
            MyNode<K, V> myNode = myLinkedList.search(word);
            return myNode != null ? myNode.value : null;
//            if (myNode != null) {
//                return myNode.value;
//            } else {
//                return null;
//            }
        }

    }

    public void add(K word, V frequency) {
        int index = getIndex(word);
        MyLinkedList<K, V> myLinkedList = myBucketArray.get(index);
        if (myLinkedList == null) {
            myLinkedList = new MyLinkedList<>();
            myBucketArray.add(index, myLinkedList);
            myLinkedList.append(word, frequency);
        } else {
            MyNode<K, V> myNode = myLinkedList.search(word);
            if (myNode == null) {
                myLinkedList.append(word, frequency);
            } else {
                myNode.value = frequency;
            }
        }

    }

    @Override
    public String toString() {
        return "HashTable{" +
                "myBucketArray=" + myBucketArray +
                '}';
    }


}
