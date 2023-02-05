package com.bridgelabz.binarysearchtree;

public class BinarySearchTree<K extends Comparable<K>> {

    public MyBinaryNode<K> root;

    public BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int value) {
        root = new MyBinaryNode<K>(value);
    }

    void insert(int key) {
        root = addRecursively(root, key);
    }

    public MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, int key) {
        if (current == null) {
            current = new MyBinaryNode<K>(key);
        }
//        int compareResult = current.key.compareTo(key);
        if (current.key == key )
            return current;
        if (current.key > key) {
            current.left = this.addRecursively(current.left, key);
        } else {
            current.right = this.addRecursively(current.right, key);
        }
        return current;
    }

    void deleteKey(int key) {
        if(search(key) ){
            root = deleteRec(root, key);
            System.out.println(key + " deleted successfully");
        }
    }
    MyBinaryNode<K> deleteRec(MyBinaryNode<K> root, int key) {
        if (root == null)
            return root;
//        int compareResult = root.key.compareTo(key);
        if ( root.key > key )
            root.left = deleteRec(root.left, key);
        else if ( root.key < key )
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }
    public void minimumValue() {
        minValue(root); }

    int minValue(MyBinaryNode<K> root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        System.out.println("Minimum value in BST is " + minv);
        return minv;
    }


    public void inorderDisplay() { inorderRec(root);
        System.out.println("");}

    void inorderRec(MyBinaryNode<K> root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }

    }

    public boolean search(int key) {
        boolean isContain = searchRecursively(this.root, key);
        if( isContain){
            System.out.println(key + " Exist");
        }
        else{
            System.out.println(key + " does not exist in BST");
        }
        return isContain;
    }

    private boolean searchRecursively(MyBinaryNode<K> current, int key) {
        if (current == null) {
            return false;
        }
//        int compareResult = current.key.compareTo(key);
        if ( current.key == key ) {
            return true;
        }
        if ( current.key > key  ) {
            return searchRecursively(current.left, key);
        } else {
            return searchRecursively(current.right, key);
        }
    }
}