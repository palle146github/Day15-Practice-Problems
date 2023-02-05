package com.bridgelabz.binarysearchtree;

public class MyBinaryNode<K> implements INode<K> {

    public int key;
    public MyBinaryNode<K> left;
    public MyBinaryNode<K> right;


    public MyBinaryNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public MyBinaryNode<K> getLeft() {
        return left;
    }

    @Override
    public void setLeft(MyBinaryNode<K> left) {
        this.left = left;
    }

    @Override
    public MyBinaryNode<K> getRight() {
        return right;
    }

    @Override
    public void setRight(MyBinaryNode<K> right) {
        this.right = right;
    }
}