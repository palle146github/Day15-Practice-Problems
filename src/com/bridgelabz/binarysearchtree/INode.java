package com.bridgelabz.binarysearchtree;

public interface INode<K> {

    public int getKey();
    public void setKey(int key);
    public MyBinaryNode<K> getLeft();
    public void setLeft(MyBinaryNode<K> left);
    public MyBinaryNode<K> getRight();
    public void setRight(MyBinaryNode<K> right);

}