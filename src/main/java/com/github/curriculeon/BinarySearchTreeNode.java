package com.github.curriculeon;

public class BinarySearchTreeNode<Key extends Comparable<Key>, Value> {

    private Key key;
    private Value value;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;
    private BinarySearchTreeNode previous;



    public BinarySearchTreeNode(Key key, Value value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Key getKey() {

        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public BinarySearchTreeNode<Key, Value> getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode<Key, Value> left) {
        this.left = left;
        if (left != null){
            left.setPrevious(this);
        }
    }

    public BinarySearchTreeNode<Key, Value> getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode<Key, Value> right) {
        this.right = right;
        if (right != null){
            right.setPrevious(this);
        }
    }


    public void setPrevious(BinarySearchTreeNode previous) {
        this.previous = previous;
    }

    public BinarySearchTreeNode getPrevious() {
        return previous;
    }

    public boolean hasprevious(){
        return previous != null;
    }

    @Override
    public String toString() {
        return "(" + getKey() + ", " + getValue() + ")";
    }
}

