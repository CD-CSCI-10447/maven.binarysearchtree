package com.github.curriculeon;

public class BinarySearchTreePrinter<Key extends Comparable<Key>, Value> {
    private final BinarySearchTree<Key, Value> bst;

    public boolean ShouldAdd(BinarySearchTreeNode<Key, Value> node, StringBuilder sb){
        String value = node.getKey().toString();
        return !sb.toString().contains(value);
    }

    public BinarySearchTreePrinter(BinarySearchTree<Key, Value> bst) {
        this.bst = bst;
    }

    private String printInOrder(BinarySearchTreeNode<Key, Value> node, StringBuilder sb) {
        if(node != null){
            printInOrder(node.getLeft(), sb);
            sb.append(node.getKey()).append("\n");
            printInOrder(node.getRight(), sb);
        }
        return sb.toString();
    }

    private String printPreOrder(BinarySearchTreeNode<Key, Value> node, StringBuilder sb) {
        int stop = 0;
        while (stop < bst.size()){
            if (node.getLeft() != null && ShouldAdd(node.getLeft(), sb))
                node = node.getLeft();
            else{
                if (ShouldAdd(node, sb)) {
                    sb.append(node.getKey()).append("\n");
                    stop++;
                }
                if (node.getRight() != null && ShouldAdd(node.getRight(), sb)) node = node.getRight();
                else node = node.getPrevious();
            }
        }
        return sb.toString();
    }

    private String printPostOrder(BinarySearchTreeNode<Key, Value> node, StringBuilder sb) {
        int stop = 0;
        while (stop < bst.size()){
            if (node.getLeft() != null && ShouldAdd(node.getLeft(), sb))
                node = node.getLeft();
            else if (node.getRight() != null && ShouldAdd(node.getRight(), sb))
                node = node.getRight();
            else{
                if (ShouldAdd(node, sb)) {
                    sb.append(node.getKey()).append("\n");
                    stop++;
                }
                node = node.getPrevious();
            }
        }
        return sb.toString();
    }

    public String printInOrder() {
        return printInOrder(bst.getRoot(), new StringBuilder());
    }

    public String printPreOrder() {
        return printPreOrder(bst.getRoot(), new StringBuilder());
    }

    public String printPostOrder() {
        return printPostOrder(bst.getRoot(), new StringBuilder());
    }
}
