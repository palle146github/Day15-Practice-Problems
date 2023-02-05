package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(68);
        bst.insert(39);
        bst.insert(84);
        bst.insert(5);
        bst.inorderDisplay();
        bst.search(909);
        bst.inorderDisplay();
        bst.deleteKey(39);
        bst.inorderDisplay();
        bst.minimumValue();
        bst.deleteKey(389);
        bst.inorderDisplay();
    }
}
