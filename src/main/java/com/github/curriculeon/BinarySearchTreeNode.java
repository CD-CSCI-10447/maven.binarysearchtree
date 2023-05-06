package com.github.curriculeon;

public class BinarySearchTreeNode<Key extends Comparable<Key>, Value> {

    private Key key;
    private Value value;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    public BinarySearchTreeNode(Key key, Value value) {
        this.key = key;
        this.value = value;
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
    }

    public BinarySearchTreeNode<Key, Value> getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode<Key, Value> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + getKey() + ", " + getValue() + ")";
    }
}

